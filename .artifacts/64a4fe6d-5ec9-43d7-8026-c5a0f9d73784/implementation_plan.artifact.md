# Implementation Plan - Fix Render Fidelity Issue and Enable Compose Preview

The user is reporting a "Layout fidelity warning" where the preview states that rendering only supports APIs up to 36, while the project is targeting API 36 (possibly with a minor version). Additionally, the user specifically mentioned "Compose Preview," but the project is currently configured for XML Views and lacks Jetpack Compose setup.

## User Review Required

> [!IMPORTANT]
> I will downgrade the `compileSdk` and `targetSdk` to 35 (Android 15) to resolve the Layout Editor fidelity warning and ensure stable rendering.
> I will also configure Jetpack Compose in the project to support the requested "Compose Preview" functionality.

## Proposed Changes

### Build Configuration

#### [MODIFY] [libs.versions.toml](file:///C:/Users/admin/AndroidStudioProjects/Exp_1/gradle/libs.versions.toml)
- Add Jetpack Compose BOM and related libraries: `androidx-compose-bom`, `androidx-ui`, `androidx-ui-tooling-preview`, `androidx-material3`.
- Add the Kotlin Compose plugin.

#### [MODIFY] [app/build.gradle.kts](file:///C:/Users/admin/AndroidStudioProjects/Exp_1/app/build.gradle.kts)
- Downgrade `compileSdk` and `targetSdk` to 35.
- Enable `compose` in `buildFeatures`.
- Add the necessary `composeOptions` if required (though with modern AGP it's often automatic or handled via plugin).
- Add Compose dependencies.

### Source Code

#### [MODIFY] [MainActivity.kt](file:///C:/Users/admin/AndroidStudioProjects/Exp_1/app/src/main/java/com/example/exp_1/MainActivity.kt)
- Add a sample `@Composable` function and a `@Preview` to provide a working Compose Preview for the user.

## Verification Plan

### Automated Tests
- Run `gradlew assembleDebug` to verify the project builds with the new dependencies and API level.

### Manual Verification
- Verify that the Layout Editor for `activity_main.xml` no longer shows the fidelity warning.
- Verify that the new Compose Preview in `MainActivity.kt` renders correctly in Android Studio.
