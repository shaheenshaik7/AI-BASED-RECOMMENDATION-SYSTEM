# AI-BASED-RECOMMENDATION-SYSTEM

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: SHAIK SHAHEEN

*INTERN ID*: CT04DY655

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

##The AI-Based-Recommendation-System built with the help of the Apache Mahout library and the main purpose of this code is to generate item recommendations for users based on their past preferences and the similarity between items. Recommendation systems like this one are widely used in the real world for example in e-commerce platforms such as Amazon, streaming services like Netflix or Spotify and even in online learning environments like Coursera or Udemy.

The code is structured inside the package com.myprojects and makes use of several important Java and Mahout classes. The Java programming language is used for its robustness, object-oriented features and compatibility with external libraries.At its core, the program starts by loading a dataset from a CSV file called ratings.csv. This dataset contains user-item interactions in the format userID, itemID, rating.The program loads this dataset using FileDataModel, a Mahout class specifically designed to handle CSV data for recommendation purposes.

Once the dataset is loaded, the system calculates the similarity between items. For this, it uses TanimotoCoefficientSimilarity, a metric that measures how similar two sets are based on overlap versus total unique elements. This metric works well in scenarios where data is binary or categorical, such as whether a user interacted with an item or not. After calculating similarity, the program builds the recommender using GenericItemBasedRecommender, which is a Mahout class that implements item-based collaborative filtering. Instead of focusing on what users are similar, this system focuses on what items are similar. If a user has interacted with one item, the recommender will suggest other items similar to it.

The program then loops through all users in the dataset using LongPrimitiveIterator. For each user, it generates the top five recommendations by calling the recommend() method. If no recommendations exist for a particular user, the program prints a message saying there are no recommendations. Otherwise, it prints the recommended item IDs along with their recommendation scores.This recommendation engine can be applied in many areas. For example, in e-commerce, it can recommend products that are similar to the ones a customer has purchased before.
In entertainment, it can suggest movies, songs, or shows similar to the ones a user already enjoys. In education, it can recommend courses or study materials based on previous learning preferences. Social media platforms can also adapt such systems to suggest friends, groups, or pages of interest to users.

This project demonstrates the fundamental concept of building a recommendation engine using Java and Apache Mahout in VS Code. VS Code is chosen as the development tool because of its lightweight environment, extensions for Java, debugging tools, and ease of integration with project structures. The Apache Mahout library plays the most crucial role in this project since it provides all the machine learning capabilities necessary to implement collaborative filtering efficiently.
It covers all the essential components of a recommender system: dataset preparation, similarity calculation, recommendation generation, and result interpretation. Beyond being a simple demonstration, it has wide applicability in real-world systems where personalization is important. With further improvements, such as hybrid filtering, integration into web applications, or the use of more advanced similarity algorithms, this project could easily evolve into a production-level recommendation engine.


##OUTPUT

![Image](https://github.com/user-attachments/assets/51a1cf58-e10a-4627-90c2-6f450208b39b)
