// File: vars/sendEmailNotification.groovy
def call(String recipient, String subject, String body) {
    emailext(
        to: recipient,
        subject: subject,
        body: body,
        attachLog: false  // Change to true if you want to attach build logs
    )
}
