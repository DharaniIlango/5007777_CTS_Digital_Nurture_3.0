package org.digital.nurture;

import org.junit.jupiter.api.Test;

class DecoratorPatternTest {

    @Test
    void testSMSNotifierDecorator() {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        smsNotifier.send("Test SMS Notification");
        // Verify behavior
    }

    @Test
    void testSlackNotifierDecorator() {
        Notifier emailNotifier = new EmailNotifier();
        Notifier slackNotifier = new SlackNotifierDecorator(emailNotifier);
        slackNotifier.send("Test Slack Notification");
        // Verify behavior
    }
}
