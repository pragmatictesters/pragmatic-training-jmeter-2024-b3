# JMeter Tips

Quick, actionable tips to help you level up your JMeter skills, improve test efficiency, and make the most out of its features.


Here’s the updated markdown tip:


## Tip #1: Extending CA Certificate Expiry in JMeter

By default, JMeter's CA certificates are valid for **7 days**. Follow these steps to extend their validity:

1. **Delete old certificates**: Remove the following files from the `bin` directory:
   - `ApacheJMeterTemporaryRootCA.crt`
   - `ApacheJMeterTemporaryRootCA.usr`
2. **Update configuration**: Open `user.properties` and add/modify the line:
   ```
   proxy.cert.validity=365
   ```
   (Set the number of days as per your requirement.)
3. **Restart JMeter**: Relaunch the application.
4. **Start the JMeter Proxy**: A new CA certificate with updated validity will be generated.


Here’s the markdown for Tip #2:


## Tip #2: Enabling Undo in JMeter

JMeter's undo feature is **disabled by default**, as it may cause performance issues with large test plans (`.jmx` files). To enable it:

1. **Update configuration**: Open `user.properties` and add the following line:
   ```
   undo.history.size=25
   ```
   (Set the history size as needed. For example, `25` allows undoing up to 25 actions.)
2. **Restart JMeter**: Relaunch the application to activate the undo feature.

Note: Use cautiously if working with large `.jmx` files. 🚀


Quick and effective! 🚀
