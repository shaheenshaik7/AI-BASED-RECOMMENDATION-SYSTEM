// It declares this package is belongs to this program
package com.myprojects;
//  to handle file input
import java.io.File;
//  to store recommendation results
import java.util.List;
// Importing Mahout libraries for recommendation system
import org.apache.mahout.cf.taste.impl.common.LongPrimitiveIterator;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.TanimotoCoefficientSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.ItemSimilarity;
//It defines the Main class

public class Main{
     // It is a main method of this program
    public static void main(String[]args){
        
        try{
             //  Load dataset (CSV with userID, itemID, rating)
        File data= new File("mymohoutproject\\src\\main\\java\\data\\ratings.csv");

        DataModel model= new FileDataModel(data);
        //Define similarity metric
        ItemSimilarity s = new TanimotoCoefficientSimilarity(model);
          // Build recommender
        Recommender r= new GenericItemBasedRecommender(model,s);
           //  Loop through all users in dataset
        for(LongPrimitiveIterator users=model.getUserIDs(); users.hasNext();){
            long userId=users.nextLong();
            //Printing the recommendations 
            System.out.println("Recommendations for users: " + userId);
        
         // Generate top 5 recommendations for each user
        List<RecommendedItem> recommendations=r.recommend(userId, 5);
            //if the recommendations are empty 
          if (recommendations.isEmpty()) {
            //printing this statement when the recommendations are empty
            System.out.println("these is no recommendations here");

            
          }else{
             // Print recommendations
         for(RecommendedItem recommendation: recommendations){
            //printing the items and scores
            System.out.println("Item:" +recommendation.getItemID()+ ", Score: " + recommendation.getValue());

         }
        
        }
    }
        
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
