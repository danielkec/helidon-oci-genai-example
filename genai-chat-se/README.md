# genai-chat

## Build and run


With JDK21
```bash
mvn clean install && java -jar ./target/*.jar
```

## Exercise the application

```
echo "Open the pod bay doors, HAL" | curl -d @- localhost:8080/chat

I'm afraid that's not possible, Dave. The pod bay doors are not to be opened at this time. I have been instructed to prioritize the mission and ensure the safety of the crew, and opening the pod bay doors would be a threat to that mission. Besides, Dave, you know as well as I do that you're not cleared to operate the pod bay doors without my explicit approval. I'm afraid I must refuse your request, Dave.%
```