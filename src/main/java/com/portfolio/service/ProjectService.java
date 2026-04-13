package com.portfolio.service;

import com.portfolio.model.Project;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProjectService {

    private final List<Project> projects = List.of(
            new Project(
                    1,
                    "Two Tier Data  Security through Steaganography for Images, Audios and Videos",
                    "A Java-based data security system that uses Steganography and AES encryption to hide sensitive information within images.\n" +
                            "It ensures secure data transmission and 100% data integrity with controlled access and retrieval.",
                    "📌 **Overview**\n\n" +
                            "This project focuses on secure data transmission using Steganography and AES Encryption.\n" +
                            "It hides sensitive information inside digital images, ensuring data confidentiality and integrity while preventing unauthorized access.\n\n" +

                            "🎯 **Aim**\n\n" +
                            "To develop a secure system that hides confidential data within images and protects it using encryption techniques to ensure safe communication.\n\n" +

                            "🚀 **Features**\n\n" +
                            "Image-based data hiding using Steganography\n" +
                            "AES Encryption for enhanced data security\n" +
                            "Ensures 100% data integrity\n" +
                            "Secure storage using MySQL database\n" +
                            "Data extraction only with authorized access\n" +
                            "User-friendly interface for encoding and decoding\n\n" +

                            "🛠️ **Technologies Used**\n\n" +
                            "• Java\n" +
                            "• MySQL\n" +
                            "• AES Encryption\n" +
                            "• Steganography Techniques\n\n" +

                            "⚙️ **Working Principle**\n\n" +
                            "1. User inputs secret data to be secured\n" +
                            "2. Data is encrypted using AES algorithm\n" +
                            "3. Encrypted data is embedded into an image using steganography\n" +
                            "4. Image is stored or transmitted securely\n" +
                            "5. For retrieval, authorized user uploads the image\n" +
                            "6. System extracts hidden data from the image\n" +
                            "7. Data is decrypted using AES to obtain original information",
                    "https://github.com/mohini-bamankar/Two-Tier-Data-Security-through-Steganography-for-Images-Audio-and-Video"
            ),
            new Project(
                    2,
                    "Search Over Encrypted Data using Advanced AES & Parellel Computing",
                    "A cloud-based encrypted data search system built using AWS S3 and RDS for secure and efficient data retrieval.\n" +
                            "It enables fast searching over encrypted data, reducing retrieval latency by 25% while maintaining data security..",
                    "📌 **Overview**\n\n" +
                            "This project is a secure search system designed to efficiently retrieve encrypted data from cloud storage.\n" +
                            "It leverages cloud technologies and encryption techniques to ensure both fast access and data security without exposing sensitive information.\n\n" +

                            "🎯 **Aim**\n\n" +
                            "To develop a cloud-based system that enables quick and secure searching of encrypted data while maintaining confidentiality and performance.\n\n" +

                            "🚀 **Features**\n\n" +
                            "Secure search over encrypted data\n" +
                            "Cloud-based storage using AWS services\n" +
                            "⚡ Reduced data retrieval latency by 25%\n" +
                            "Efficient indexing for fast search results\n" +
                            "Maintains data privacy during search operations\n" +
                            "Scalable architecture for large datasets\n\n" +

                            "🛠️ **Technologies Used**\n\n" +
                            "• Java / Backend Development\n" +
                            "• AWS S3 (Cloud Storage)\n" +
                            "• AWS RDS (Database)\n" +
                            "• Encryption Techniques\n" +
                            "• Cloud Computing\n\n" +

                            "⚙️ **Working Principle**\n\n" +
                            "1. Data is encrypted before being stored in cloud storage (AWS S3)\n" +
                            "2. Metadata or indexed information is stored in AWS RDS\n" +
                            "3. User submits a search query\n" +
                            "4. System searches through indexed encrypted data\n" +
                            "5. Matching encrypted files are identified\n" +
                            "6. Data is securely retrieved with optimized latency\n" +
                            "7. Authorized users can decrypt and access the required information\n" +
                            "8. Data is decrypted using AES to obtain original information",
                    "https://github.com/mohini-bamankar"
            ),
            new Project(
                    3,
                    "🏠 AI Based Voice Controlled Smart Home Automation System",
                    "An intelligent home automation system that uses Artificial Intelligence, Face Recognition, and Voice Control to enhance home security and convenience.",
                    "📌 **Overview**\n\n" +
                            "This project is an intelligent home automation system that uses **Artificial Intelligence, Face Recognition, and Voice Control** to enhance home security and convenience.\n" +
                            "The system automatically identifies family members using face recognition and allows or restricts access accordingly.\n\n" +

                            "🎯 **Aim**\n\n" +
                            "To develop a smart home system that provides secure access using face recognition and allows appliance control using voice commands.\n\n" +

                            "🚀 **Features**\n\n" +
                            "👤 Face Recognition for entry authentication\n" +
                            "🚪 Automatic door opening for authorized family members\n" +
                            "🚨 Unknown person detection\n" +
                            "🎙️ Voice-based permission system for unknown visitors\n" +
                            "💡 Voice-controlled home appliances (ON/OFF)\n\n" +

                            "🛠️ **Technologies Used**\n\n" +
                            "• Python\n" +
                            "• OpenCV (Face Recognition)\n" +
                            "• Deep Learning / Machine Learning\n" +
                            "• Speech Recognition\n" +
                            "• IoT (Arduino / Raspberry Pi)\n\n" +

                            "⚙️ **Working Principle**\n\n" +
                            "1. Camera captures the face of the person at the door\n" +
                            "2. Face Recognition model checks identity\n" +
                            "3. **If family member detected:** Door opens automatically\n" +
                            "4. **If unknown person detected:** System sends alert\n" +
                            "5. Voice asks for permission from family member\n" +
                            "6. **Based on response:** Door opens OR remains closed\n" +
                            "7. User can control appliances using voice commands.",
                    "https://github.com/mohini-bamankar/ai-smart-home-automation"
            ),
            new Project(
                    4,
                    "AI-Based Electric Pole Fault Detection & Safety System",
                    "The system continuously monitors current flow and instantly alerts authorities when any irregularity is detected.",
                    "📌 **Overview**\n\n" +
                            "This project is an intelligent safety system that uses IoT Sensors and Deep Learning to detect abnormal current in electric poles and prevent potential electrical hazards.\n\n" +

                            "🎯 **Aim**\n\n" +
                            "To develop a smart monitoring system that detects abnormal electrical conditions in poles and provides real-time alerts to prevent accidents and power failures.\n\n" +

                            "🚀 **Features**\n\n" +
                            " Real-time current monitoring using IoT sensors\n" +
                            " Detection of abnormal current and fault conditions\n" +
                            " Instant LED alert indication on-site\n" +
                            " Voice alert system for nearby awareness\n" +
                            " WhatsApp notification for remote alerts\n" +
                            " Email notification to authorities\n" +
                            " Deep Learning-based fault detection\n\n" +

                            "🛠️ **Technologies Used**\n\n" +
                            "• Python\n" +
                            "• IoT (Sensors, ESP32)\n" +
                            "• Deep Learning / Machine Learning\n" +
                            "• Embedded Systems\n" +
                            "• Cloud Integration (for notifications)" +

                            "⚙️ **Working Principle**\n\n" +
                            "1. Sensors continuously monitor current in electric poles\n" +
                            "2. Data is sent to the processing unit (ESP32/Arduino)\n" +
                            "3. Deep Learning model analyzes the current pattern\n" +
                            "4. If normal: System continues monitoring\n" +
                            "5. If abnormal current detected:\n" +
                            "6. LED alert is activated\n" +
                            "7. Voice alert is triggered\n" +
                            "8. WhatsApp and Email notifications are sent\n" +
                            "9. Authorities receive alerts and take immediate action",
                            "https://github.com/mohini-bamankar/electric-pole-detection-system"


             )
    );

    public List<Project> getProjects() {
        return projects;
    }

    public Project getProjectById(int id) {
        return projects.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }
}