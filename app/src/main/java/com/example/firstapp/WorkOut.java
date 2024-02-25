package com.example.firstapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkOut {
    Map<String, String>  workoutlist(String workouttypes){
        Map<String, String> workoutMap = new HashMap<>();

        if (workouttypes.equals("Chest")) {
            workoutMap.put("BenchPress", "The bench press is a compound exercise that targets the muscles of the upper body. It involves lying on a bench and pressing weight upward using either a barbell or a pair of dumbbells. During a bench press, you lower the weight down to chest level and then press upwards while extending your arms.");
            workoutMap.put("CableFlyes", "The cable fly is a chest fly variation which uses the cable machine to target the pectorals, with both the deltoids, triceps, and core engaged to help with stability. While the arms replicate the movement of the dumbbell fly, a standing position is adopted.");
        } else if (workouttypes.equals("Triceps")) {
            workoutMap.put("TricepDips", "An exercise to make your triceps (the large muscle at the back of the upper arm) stronger. It involves raising and lowering your body on your hands with your arms bent behind you, while in a sitting position with your legs straight out in front of you: Tricep dips are great exercises for skiers.");
            workoutMap.put("TricepExtensions", "The Tricep Extension is an isolation movement that helps develop and strengthen the triceps, the muscles that run along the back of your upper arm. You can practice this exercise standing or sitting on a bench for back support.");
        } else if (workouttypes.equals("Biceps")) {
            workoutMap.put("BicepCurls", "A bicep curl usually starts with the arm in a fully extended position, holding a weight with a supinated (palms facing up) grip. A full repetition consists of bending or \"curling\" the elbow until it is fully flexed, then slowly lowering the weight to the starting position.");
            workoutMap.put("HammerCurls", "Hammer curls are biceps curls performed with your hands facing each other. They're beneficial to add mass to your arms and can help focus more attention on the short head of the biceps. They may be easier to tolerate than the traditional biceps curl.");
        } else if (workouttypes.equals("Shoulder")) {
            workoutMap.put("ShoulderPress", "The overhead press, also known as the shoulder press, strict press or military press, is an upper-body weight training exercise in which the trainee presses a weight overhead while seated or standing.");
            workoutMap.put("LateralRaises", "The lateral raise is a strength training isolation exercise that works the shoulders (specifically the lateral deltoids), with the trapezius (upper back) supporting by stabilising the exercise. This exercise involves lifting weights away from your body, out to the side.");
        }

        return workoutMap ;

    }
}
