# Floating Isles — Android TV ambient display

A procedurally generated floating-island world rendered entirely in text,
wrapped as a native Android TV app. Two modes in one APK:

- **App mode** — launch it from the TV home screen; holds the screen awake
  forever (no 2-hour backdrop timeout).
- **Screensaver mode** — appears in Settings > Device Preferences >
  Screen saver as "Floating Isles", replacing Google Backdrop.

## Build (no Android Studio needed)
1. Push this repo to GitHub (branch `main`).
2. The **Build APK** workflow runs automatically (Actions tab).
3. Download the `floating-isles-apk` artifact, unzip → `app-debug.apk`.

## Install on the TV
1. On the TV: Settings > Device Preferences > Security > allow unknown sources
   for your file/installer app.
2. Easiest path: install **"Send files to TV"** on both phone and TV
   (or use the **Downloader** app with a direct link to the APK).
3. Send/download the APK, open it on the TV, install.
4. Launch **Floating Isles** from the app row, or set it as the screensaver in
   Settings > Device Preferences > Screen saver.

## Updating the animation
Replace `app/src/main/assets/floating-isles.html`, push, download the new APK.
