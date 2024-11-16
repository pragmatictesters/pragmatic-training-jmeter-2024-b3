# Installing JMeter Root Certificate on macOS

JMeter requires a CA (Certificate Authority) certificate to intercept HTTPS traffic when using the HTTP(S) Test Script Recorder. This document provides a step-by-step guide for installing the JMeter Root Certificate on macOS.

## What is the JMeter CA Certificate?

- **Purpose**: The JMeter CA certificate is a temporary self-signed certificate created by JMeter to enable HTTPS traffic recording.
- **Expiry Date**: The certificate is valid for the duration of the JMeter session (deleted after JMeter is closed).
- **Security**: It is used only locally during the recording process and should not be trusted permanently.

---

## Steps to Install the JMeter Root Certificate on macOS

### 1. Generate the JMeter CA Certificate
1. Open JMeter and go to `File` > `Templates`.
2. Select the **Recording** template and click **Create**.
3. Start the **HTTP(S) Test Script Recorder** by clicking the green start button in the `HTTP(S) Test Script Recorder` component.
4. JMeter will generate a `ApacheJMeterTemporaryRootCA.crt` file and save it in the `bin` directory of your JMeter installation.

---

### 2. Add the Certificate to macOS Keychain
1. Open the **Keychain Access** application on macOS (use Spotlight to search for "Keychain Access").
2. Drag and drop the `ApacheJMeterTemporaryRootCA.crt` file into the **Keychain Access** window.
3. The certificate will appear in the **Keychains > Login** and **Category > Certificates** sections.

---

### 3. Mark the Certificate as Trusted
1. Double-click on the `ApacheJMeterTemporaryRootCA` certificate in the Keychain.
2. Expand the **Trust** section by clicking the arrow.
3. Set **When using this certificate** to **Always Trust**.
4. Close the window and enter your macOS password to confirm.

---

### 4. Verify the Certificate
1. In Keychain Access, ensure the `ApacheJMeterTemporaryRootCA` certificate shows a blue "+" icon or says "Trusted."
2. If it doesn’t, repeat the steps to mark it as trusted.

---

### 5. Configure JMeter Proxy Settings
1. In JMeter, configure the **HTTP(S) Test Script Recorder** with the following:
   - **Port**: Default is `8888`.
   - **Target Controller**: Select where recorded requests should be saved.
   - **Use HTTPS**: Ensure this is enabled.
2. Start the recorder and set your browser or system proxy to `localhost:8888`.

---

### 6. Remove the Certificate After Recording
For security reasons, remove the certificate from Keychain Access after your recording session:
1. Open **Keychain Access**.
2. Select the `ApacheJMeterTemporaryRootCA` certificate.
3. Right-click and choose **Delete Certificate**.
4. Confirm the deletion.

---

## Troubleshooting
- If the browser or system shows certificate errors, ensure the certificate is properly marked as **Trusted**.
- Restart your browser/system after installing the certificate.

By following these steps, you can successfully install and use the JMeter root certificate on macOS for HTTPS traffic recording.