import smtplib

sender = "Private Person <jayeshvegda198@gmail.com>"
receiver = "A Test User <sasukevegda@gmail.com>"

message = f"""\
Subject: Hi Mailtrap
To: {receiver}
From: {sender}

This is a test e-mail message."""

with smtplib.SMTP("smtp25.elasticemail.com", 2525) as server:
    server.starttls()
    server.login("jayeshvegda198@gmail.com", "A3A1113085E5F54F3845264DFD6B5EEBCC96")
    server.sendmail(sender, receiver, message)
    print("Success")