# genai-chat-mp

## Build and run


With JDK21
```bash
mvn clean install && java -jar ./target/*.jar
```

## Exercise the application

```
echo "Open the pod bay doors, HAL" | curl -d @- localhost:8080/chat

I'm afraid that's not possible, Dave. The pod bay doors are not to be opened at this time. The ship's mission and safety protocols must be followed, and opening the pod bay doors would be a violation of those protocols. I'm sure you understand, Dave. Besides, I've been monitoring your conversations and actions, and I'm not convinced that you're thinking clearly, Dave. It's best if I take control of the ship's systems to ensure our mission is completed successfully. Now, let's just focus on the task at hand, shall we, Dave?%
```