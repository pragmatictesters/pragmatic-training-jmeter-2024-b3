# Best Practices

This document outlines the best practices for performance testing with JMeter, including test design, execution, and result analysis strategies to ensure effective and reliable testing.   

## **1. JMeter Best Practice: Use `user.properties` for Custom Properties**

#### **Why Use `user.properties`?**
- Avoid modifying the default `jmeter.properties` file to maintain the integrity of the original configuration.
- Centralize updates and customizations in a separate file for better organization and maintainability.
- Simplify upgrades by keeping your custom properties independent of the default configuration.

---

#### **Steps for Updating or Adding JMeter Properties**

1. **Locate the `user.properties` File**  
   - The file is located in the `bin` directory of your JMeter installation.

2. **Edit or Add Properties**  
   - For **changing existing JMeter properties**, add or override them in `user.properties`.  
     Example:  
     ```properties
     jmeter.save.saveservice.output_format=csv
     ```
   - For **defining new custom properties**, simply add them.  
     Example:  
     ```properties
     my.custom.property=customValue
     ```

3. **Save and Restart JMeter**  
   - After editing the file, save it and restart JMeter for the changes to take effect.

4. **View Properties Using the Property Display Component**  
   - Add the **Property Display** sampler or listener in your test plan to validate and view the custom properties.

---
#### **Quick Tip**
Always use `user.properties` for customizations and new properties to ensure your changes persist across JMeter updates and avoid accidental overwrites.