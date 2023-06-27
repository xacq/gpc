import cv2
import numpy as np
from keras.models import load_model
import pygame


B1 = "B1.mp3"
B5 = "B5.mp3"
B10 = "B10.mp3"
B20 = "B20.mp3"
M01 = "M01.mp3"
M1 = "M1.mp3"
M05 = "M05.mp3"
M10 = "M10.mp3"
M25 = "M25.mp3"
M50 = "M50.mp3"
noway = "wayno.mp3"

pygame.init()
pygame.mixer.init()
model = load_model('keras_model.h5')# Load the model
labels = open('labels.txt', 'r').readlines() # Grab the labels from the labels.txt file. This will be used later.
camera = cv2.VideoCapture(1) # CAMERA can be 0 or 1 based on default camera of your computer.
while True:
    ret, image = camera.read()    # Grab the webcameras image.
    #image = cv2.resize(image, (224, 224), interpolation=cv2.INTER_AREA)     # Resize the raw image into (224-height,224-width) pixels.
    cv2.imshow('Webcam Image', image)    # Show the image in a window
    image = np.asarray(image, dtype=np.float32).reshape(1, 224, 224, 3)     # Make the image a numpy array and reshape it to the models input shape.
    image = (image / 127.5) - 1     # Normalize the image array
    probabilities = model.predict(image)
    index = np.argmax(probabilities)
    class_name = labels[index]
    case = class_name.strip()
    confidence_score = probabilities[0][index]
    if confidence_score > 0.99:
        print("Class:", case)
        print("Confidence score:", confidence_score)
        if case == "0 B1":
            pygame.mixer.music.load(B1)
            pygame.mixer.music.play()
            while pygame.mixer.music.get_busy():
                pygame.time.wait(1000)
        elif case == "1 B1R":
            pygame.mixer.music.load(B1)
            pygame.mixer.music.play()
            while pygame.mixer.music.get_busy():
                pygame.time.wait(1000)
        elif case == "2 B5":
            pygame.mixer.music.load(B5)
            pygame.mixer.music.play()
            while pygame.mixer.music.get_busy():
                pygame.time.wait(1000)
        elif case == "3 B5R":
            pygame.mixer.music.load(B5)
            pygame.mixer.music.play()
            while pygame.mixer.music.get_busy():
                pygame.time.wait(1000)
        elif case == "4 B10":
            pygame.mixer.music.load(B10)
            pygame.mixer.music.play()
            while pygame.mixer.music.get_busy():
                pygame.time.wait(1000)
        elif case == "5 B10R":
            pygame.mixer.music.load(B10)
            pygame.mixer.music.play()
            while pygame.mixer.music.get_busy():
                pygame.time.wait(1000)
        elif case == "6 B20":
            pygame.mixer.music.load(B20)
            pygame.mixer.music.play()
            while pygame.mixer.music.get_busy():
                pygame.time.wait(1000)
        elif case == "7 B20R":
            pygame.mixer.music.load(B20)
            pygame.mixer.music.play()
            while pygame.mixer.music.get_busy():
                pygame.time.wait(1000)
        elif case == "8 M01":
            pygame.mixer.music.load(M01)
            pygame.mixer.music.play()
            while pygame.mixer.music.get_busy():
                pygame.time.wait(1000)
        elif case == "9 M1":
            pygame.mixer.music.load(M1)
            pygame.mixer.music.play()
            while pygame.mixer.music.get_busy():
                pygame.time.wait(1000)
        elif case == "10 M05":
            pygame.mixer.music.load(M05)
            pygame.mixer.music.play()
            while pygame.mixer.music.get_busy():
                pygame.time.wait(1000)
        elif case == "11 M10":
            pygame.mixer.music.load(M10)
            pygame.mixer.music.play()
            while pygame.mixer.music.get_busy():
                pygame.time.wait(1000)
        elif case == "12 M25":
            pygame.mixer.music.load(M25)
            pygame.mixer.music.play()
            while pygame.mixer.music.get_busy():
                pygame.time.wait(1000)
        elif case == "13 M50":
            pygame.mixer.music.load(M50)
            pygame.mixer.music.play()
            while pygame.mixer.music.get_busy():
                pygame.time.wait(1000)
    keyboard_input = cv2.waitKey(1)     # Listen to the keyboard for presses.
    if keyboard_input == 27:    # 27 is the ASCII for the esc key on your keyboard.
        break

pygame.quit()
camera.release()
cv2.destroyAllWindows()