# Implementation Plan - Fix ConstraintLayout Render Issue and Enable Compose Preview

The user is experiencing a "Missing classes" error for `androidx.constraintlayout.widget.ConstraintLayout` in what they refer to as the "Compose Preview". The project currently uses standard Views but seems to be targeting an experimental API level (36) and lacks proper Compose configuration.

## User Review Required

> [!IMPORTANT]
> The project is currently configured with experimental versions (AGP 9.3.1, Gradle 9.6.1, API 36). I will downgrade the API level to 35 (Android 15) to ensure stability in the Layout Editor and Compose Preview.

## Proposed Changes

### Build Configuration

#### [MODIFY] [libs.versions.toml](file:///C:/Users/admin/AndroidStudioProjects/Exp_1/gradle/libs.versions.toml)
- Add Compose dependencies: `androidx-compose-bom`, `androidx-ui`, `androidx-ui-graphics`, `androidx-ui-tooling-preview`, `androidx-material3`, `androidx-constraintlayout-compose`.
- Add Kotlin plugin definition.

#### [MODIFY] [app/build.gradle.kts](file:///C:/Users/admin/AndroidStudioProjects/Exp_1/app/build.gradle.kts)
- Enable `compose` in `buildFeatures`.
- Set `compileSdk` and `targetSdk` to 35.
- Add Compose dependencies.

### Source Code

#### [MODIFY] [MainActivity.kt](file:///C:/Users/admin/AndroidStudioProjects/Exp_1/app/src/main/java/com/example/exp_1/MainActivity.kt)
- Add a `@Composable` function and a `@Preview` to support the user's request for "Compose Preview".

## Verification Plan

### Automated Tests
- Run `./gradlew assembleDebug` to ensure the project still builds.

### Manual Verification
- Check the Compose Preview in `MainActivity.kt`.
- Check the Layout Editor for `activity_main.xml`.
