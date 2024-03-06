Feature: Bowling Game Score

As a bowler
I want to calculate my bowling game score
So that I can know the winner

Scenario: Gutter game
  Given a bowling game
  When I roll the following line "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0"
  Then my score is 0

Scenario: Game all ones
  Given a bowling game
  When I roll the following line "1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1"
  Then my score is 20

Scenario: Game with spare
  Given a bowling game
  When I roll the following line "5,5,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0"
  Then my score is 16

Scenario: Game with strike
  Given a bowling game
  When I roll the following line "10,5,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0"
  Then my score is 26

Scenario: Perfect game 
 Given a bowling game
 When I roll the following line "10,10,10,10,10,10,10,10,10,10,10,10"
 Then my score is 300

# Scenario: Almost perfect game 
# Given a bowling game
# When I roll the following line "10,10,10,10,10,10,10,10,10,5,5,10"
# Then my score is 275

Scenario: Partial game 
Given a bowling game
When I roll the following line "5,5,3,0"
Then my score is 16