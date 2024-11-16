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


Quick and effective! 🚀
