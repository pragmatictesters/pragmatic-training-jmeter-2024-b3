# Common Issues

A troubleshooting guide for addressing frequent problems encountered while using JMeter, with solutions and tips to resolve them effectively.


# 1. Resolving "Unsupported Class File Major Version" Error in JMeter

## Error Overview
This error occurs when using an incompatible Java version with JMeter, often when Groovy scripts are involved, as Groovy does not support the latest Java versions. Example log:
```
Unsupported class file major version 66
```
- **Major version 66** corresponds to **Java 17**.
- JMeter supports **Java 8** or **Java 11**.

---

## Solution: Downgrade Java

### Step 1: Check Current Java Version
Run:
```bash
java -version
```
If it shows **Java 17**, proceed with the downgrade.

---

### Step 2: Install Java 11 or 8 (macOS)
1. Install Homebrew (if not already installed):
   ```bash
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
   ```

2. Install Java:
   ```bash
   brew install openjdk@11
   ```
   Or:
   ```bash
   brew install openjdk@8
   ```

---

### Step 3: Set Java Version
Configure the environment:
- For Java 11:
  ```bash
  export JAVA_HOME="$(brew --prefix openjdk@11)"
  export PATH="$JAVA_HOME/bin:$PATH"
  ```
- For Java 8:
  ```bash
  export JAVA_HOME="$(brew --prefix openjdk@8)"
  export PATH="$JAVA_HOME/bin:$PATH"
  ```

Verify:
```bash
java -version
```
---

### Step 4: Restart JMeter
Restart JMeter and ensure the error is resolved. If issues persist, check `jmeter.log`.

---

