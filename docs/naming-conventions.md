# Naming Conventions

Guidelines for consistent and clear naming conventions for test plans, scripts, variables, logs, and reports to maintain organization and readability.


## **1. Folder Naming**
- **Format**: Use all lowercase letters, separating words with a `-`.
- **Examples**:
    - `test-results`
    - `test-plans`
    - `docs`

---

## **2. Test Plan Naming**
- **Format**: Use the prefix `test-plan`, followed by the project name, and a descriptive name of its functionality.
- **Examples**:
    - `test-plan-hrm-login-flow.jmx`
    - `test-plan-addidas-cart-checkout.jmx`
    - `test-plan-hrm-user-registration.jmx`

---

## **3. Component Naming**
- **Format**: `<Existing Component Name>: <Custom Name>`
    - Preserve the original component name for identification in the test tree.
    - **Examples**:
        - `HTTP Request: Login API`
        - `Thread Group: Load Simulation`
        - `JSR223 Sampler: Custom Data Parsing`

---

## **4. JMeter Properties**
- **Format**: Follow the naming convention used in `jmeter.properties` (dot-separated lowercase).
- **Examples**:
  ```properties
  # Environment-specific base URL
  env.base.url=https://example.com
  ```

---

## **5. Variables and Parameters**
- Use descriptive names with camelCase.
- Prefix variables with their scope or purpose.
- **Examples**:
    - `${envBaseUrl}`
    - `${userCredentials}`
    - `${dataItemCount}`

---

## **6. Groovy Scripting (JSR223 Components, Functions, Utilities)**
- **Class Names**: Use PascalCase. Example: `CustomResponseParser`
- **Method Names**: Use camelCase. Example: `parseResponseData()`
- **Variables**: Use camelCase. Example: `userList`

---

## **7. Descriptive Comments**
- Add comments for properties, components, and scripts to describe their purpose.
- **Examples**:
  ```properties
  # Set the maximum thread count for the load test
  load.test.max.threads=500
  ```
  ```groovy
  // Function to parse and log response data
  def parseResponseData(response) {
      log.info("Parsing response: ${response}")
  }
  ```

---

### **Quick Tip**
Using consistent folder and test plan naming conventions makes navigation easier in larger projects. Comments and well-structured naming conventions improve clarity and maintainability for all team members.