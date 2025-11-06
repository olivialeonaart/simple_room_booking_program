#<ins>**Simple Room Booking Program Project:**</ins>
------------------------------------
### This program application takes user input through text-based prompts to help user "book" a hotel room with various assets and upgrades and then repeats the entire booking details back to user.
------------------------------------
**How it's Made:**
Tech Used: _Java_

- imported a scanner
- organized our variables for the booking menu
    - occupancy choice
    - bed configuration
    - room layout options
    - special/additional features
 
**Lessons Learned:**
    - getting better with user input and using the scanner tool
    - using conditional branches
    - creating branches within branches for more complex decision making
 
# **program breakdown:**
- Start program
    - Start program choice (option 1 and 2)
        - Get user input for start program
            - If input == 1, next menu
            - If input == 2, exit program
            - Else ask for correct input
  - Get preferred occupancy type choice as  input (option 1-4) from menu
        - Get user input
            - If input == 1, 2, or 3 set value as occupancy_choice value
            - If input == 4, exit program
            Else ask for correct input
    - Get preferred bed configuration choice as input (option 1-4) from menu
- Get user input
            - If input == 1, 2, or 3 set value as bedconfig_choice value
            - If input == 4, exit program
            - Else ask for correct input
    - Get preferred room layout choice as input (option 1-4) from menu
        - Get user input
            - If input == 1, 2, or 3 set value as layout_choice value
            - If input == 4, exit program
            - Else ask for correct input
    - Mention special features list and ask if user is interested in them
        -  Get user input
            - If input == 1, next menu
            - If input == 2, exit program
            - Else ask for correct input
    - Get preference on special feature 1 (option 1-3)
        - Get user input
            - If input == 1, set specialfeaturechoice1 value as the name of feature 1
            - If input == 2, next menu
            - If input == 3, exit program
            - Else ask for correct input
    - Get preference on special feature 2 (option 1-3)
        - Get user input
            - If input == 1, set specialfeaturechoice2 value as the name of feature 2
            - If input == 2, next menu
            - If input == 3, exit program
            - Else ask for correct input
    - Get preference on special feature 3 (option 1-3)
        - Get user input
            - If input == 1, set specialfeaturechoice3 value as the name of feature 3
            - If input == 2, next menu
            -  If input == 3, exit program
            - Else ask for correct input
    - Get preference on special feature 4 (option 1-3)
        - Get user input
            - If input == 1, set specialfeaturechoice4 value as the name of feature 4
            - If input == 2, next menu
            - If input == 3, exit program
            - Else ask for correct input
    - Insert final output blurb about “we look forward to your stay with us, here are your room details:
    - List occupancy type, bed config, room layout and chosen special features
    - Thank you for choosing (name) for your hotel booking needs
- Press any key to exit program
- End program

