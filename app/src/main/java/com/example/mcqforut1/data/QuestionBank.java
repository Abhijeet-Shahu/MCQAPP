package com.example.mcqforut1.data;

import com.example.mcqforut1.model.Question;

import java.util.ArrayList;
import java.util.Collections;

public class QuestionBank {

    public static ArrayList<Question> getETIQuestionsByChapter(int chapter) {
        ArrayList<Question> list = new ArrayList<>();

        if (chapter == 3) {
            addChapter3(list);
        } else if (chapter == 4) {
            addChapter4(list);
        } else if (chapter == 5) {
            addChapter5(list);
        }

        Collections.shuffle(list);
        return list;
    }

    private static void addChapter3(ArrayList<Question> list) {
        list.add(new Question(
                "Which industry uses blockchain for secure cross-border payments-",
                new String[]{"Healthcare", "Finance", "Supply Chain", "Gaming"},
                0
        ));

        list.add(new Question(
                "Blockchain improves supply chains by ........",
                new String[]{"Reducing transparency", "Tracking products from origin to consumer", "Hiding product details", "Increasing fraud risk"},
                1
        ));

        list.add(new Question(
                "In healthcare, blockchain helps by ........",
                new String[]{"Making all patient data public", "Securely storing and sharing medical records", "Slowing down data access", "Reducing data collection"},
                1
        ));

        list.add(new Question(
                "Blockchain offers gamers the ability to ........",
                new String[]{"Own in-game assets as NFTs", "Cheat on games", "Avoid transparency", "Use centralized servers"},
                0
        ));

        list.add(new Question(
                "Cross-border payments on blockchain are ........",
                new String[]{"Slow and costly", "Faster and cheaper due to lack of intermediaries", "Only for cryptocurrency", "Not traceable"},
                1
        ));

        list.add(new Question(
                "Which of the following Industry can use blockchain Technology-",
                new String[]{"Logistics and supply chain", "Medical records", "Financial Market", "All of these"},
                2
        ));

        list.add(new Question(
                "In supply chain applications, blockchain primarily helps by",
                new String[]{"Reducing transparency", "Tracking products and ensuring authenticity", "Replacing sensors", "Removing cloud computing"},
                1
        ));

        list.add(new Question(
                "A hospital wants to securely share patient records across multiple clinics while maintaining privacy. Which type of blockchain is most suitable-",
                new String[]{"Public Blockchain", "Private Blockchain", "Consortium Blockchain", "Hybrid Blockchain"},
                0
        ));

        list.add(new Question(
                "A gaming company wants to give players ownership of in-game assets through blockchain tokens that are tradable across platforms. Which application of blockchain does this represent-",
                new String[]{"Finance", "Healthcare", "Gaming (NFTs / Digital Assets)", "Supply Chain"},
                0
        ));

        list.add(new Question(
                "A smart contract is used to automatically release payment when goods are delivered in a supply chain. Which blockchain feature makes this possible-",
                new String[]{"Decentralization", "Transparency", "Immutability and automation", "Cryptocurrency mining"},
                0
        ));

        list.add(new Question(
                "Smart contracts_______",
                new String[]{"Require a lawyer to enforce", "Are self-executing contracts coded on blockchain", "Can be changed anytime by the creator", "Need intermediaries"},
                1
        ));

        list.add(new Question(
                "Which is a key feature of smart contracts-",
                new String[]{"Autonomy and immutability", "Manual execution", "Require human intervention", "Can be erased easily"},
                0
        ));

        list.add(new Question(
                "Bitcoin is ........",
                new String[]{"A centralized digital currency", "A cryptocurrency operating on blockchain", "A fiat currency", "Not related to blockchain"},
                0
        ));

        list.add(new Question(
                "Ethereum is known for ........",
                new String[]{"Only cryptocurrency transactions", "Enabling smart contract execution", "Being a private blockchain", "Centralized control"},
                1
        ));

        list.add(new Question(
                "Bitcoin and Ethereum are examples of:",
                new String[]{"Private Blockchains", "Public Blockchains", "Consortium Blockchains", "Hybrid Blockchains"},
                1
        ));

        list.add(new Question(
                "Bitcoin and Ethereum are examples of",
                new String[]{"Currency", "Cryptocurrency", "Cryptography", "Algorithm"},
                1
        ));

        list.add(new Question(
                "Which of the following is a popular cryptocurrency-",
                new String[]{"Ethereum", "MySQL", "Python", "Hyperledger"},
                0
        ));

        list.add(new Question(
                "Which blockchain is known for pioneering smart contracts-",
                new String[]{"Bitcoin", "Ethereum", "Litecoin", "Dogecoin"},
                0
        ));

        list.add(new Question(
                "A smart contract is",
                new String[]{"A physical contract stored digitally", "A self-executing program with the terms of the agreement coded", "A blockchain token", "A database management system"},
                0
        ));

        list.add(new Question(
                "“Smart contracts” are based on ........",
                new String[]{"“if/when…then” logic", "Manual approval process", "Paper documentation", "Third-party arbitration"},
                0
        ));

        list.add(new Question(
                "The biggest scalability challenge is ........",
                new String[]{"Slow transactions as network grows", "Too much transparency", "Lack of security", "Too many users"},
                0
        ));

        list.add(new Question(
                "Proof of Work consensus consumes ........",
                new String[]{"Minimal energy", "High energy due to mining computations", "No electricity", "Renewable resources only"},
                1
        ));

        list.add(new Question(
                "Regulatory uncertainty ........",
                new String[]{"Encourages rapid adoption", "Hinders blockchain adoption globally", "Is resolved everywhere", "Does not affect blockchain"},
                1
        ));

        list.add(new Question(
                "What is a \"51% attack\"-",
                new String[]{"When a single user controls over half of all mining power", "More than half network uses blockchain", "Over half transactions are instant", "None of the above"},
                0
        ));

        list.add(new Question(
                "Immutability challenges include ........",
                new String[]{"Inability to correct errors once stored", "Data easily altered", "Data deleted automatically", "Frequent rollbacks"},
                0
        ));

        list.add(new Question(
                "A privacy issue in public blockchains is ........",
                new String[]{"Complete anonymity", "Exposure of transaction details publicly", "Data encryption", "Transparency for trusted users only"},
                0
        ));

        list.add(new Question(
                "Which blockchain challenge is associated with high energy consumption due to mining-",
                new String[]{"Scalability", "Security", "Efficiency", "Decentralization"},
                3
        ));

        list.add(new Question(
                "What is tokenization in blockchain-",
                new String[]{"Converting assets into digital tokens for easier transfer", "Hiding asset identity", "Destroying digital records", "Encrypting personal data only"},
                3
        ));

        list.add(new Question(
                "Which blockchain consensus reduces energy consumption compared to Proof of Work-",
                new String[]{"Proof of Stake", "Proof of Authority", "Proof of Identity", "Proof of Power"},
                0
        ));

        list.add(new Question(
                "Gas fees in Ethereum are used to ........",
                new String[]{"Pay transaction processing on blockchain", "Control user access", "Reward users with tokens", "None of the above"},
                0
        ));

        list.add(new Question(
                "Which layer of blockchain architecture is responsible for validating and recording transactions-",
                new String[]{"Data Layer", "Network Layer", "Consensus Layer", "Application Layer"},
                0
        ));

        list.add(new Question(
                "What is a dApp",
                new String[]{"Type of Blockchain", "A type of Cryptocurrency", "A decentralized Application", "Smart Contract"},
                0
        ));

        list.add(new Question(
                "How many layers are there in Blockchain architecture-",
                new String[]{"3", "4", "5", "7"},
                0
        ));

        list.add(new Question(
                "Blockchain 2.0 is born in the year-",
                new String[]{"2009", "2014", "2017", "2018"},
                0
        ));

        list.add(new Question(
                "____ is used in peer to peer communications between the nodes that allow them to discover each other and get synchronized with another node.-",
                new String[]{"Presentation Layer", "Application Layer", "Propagation Layer", "Semantic Layer"},
                2
        ));

    }

    private static void addChapter4(ArrayList<Question> list) {
        list.add(new Question(
                "Immersive technology merges:",
                new String[]{"Hardware and software", "Physical and digital environments", "Data and storage", "Networks"},
                0
        ));

        list.add(new Question(
                "Main purpose of immersive technology is to:",
                new String[]{"Replace physical systems", "Enhance user experience through engagement", "Reduce computer speed", "Store more data"},
                3
        ));

        list.add(new Question(
                "Which technology completely replaces the real world with a simulated one-",
                new String[]{"AR", "VR", "MR", "XR"},
                1
        ));

        list.add(new Question(
                "The device Essential for VR experience:",
                new String[]{"Monitor", "VR headset", "Smartphone", "Keyboard"},
                1
        ));

        list.add(new Question(
                "Augmented Reality works by:",
                new String[]{"Simulating only virtual worlds", "Overlaying digital objects on real world", "Creating Sound-based simulations", "Replacing human senses"},
                1
        ));

        list.add(new Question(
                "Mixed Reality (MR) is a combination of:",
                new String[]{"AR and AI", "VR and IoT", "AR and VR", "None of these"},
                2
        ));

        list.add(new Question(
                "The term XR (Extended Reality) refers to:",
                new String[]{"Only VR applications", "Combination of VR, AR, MR", "Only AR applications", "Gaming technology"},
                1
        ));

        list.add(new Question(
                "Haptic technology mainly stimulates which human sense:",
                new String[]{"Hearing", "Touch", "Vision", "Smell"},
                1
        ));

        list.add(new Question(
                "A common example of AR in daily life is:",
                new String[]{"Google Docs", "Pokémon GO", "YouTube", "PowerPoint"},
                0
        ));

        list.add(new Question(
                "Which Immersive technology allows users to interact with both real & digital objects in real time:",
                new String[]{"AR", "MR", "VR", "XR"},
                1
        ));

        list.add(new Question(
                "The sense of \"presence\" in immersive technology means:",
                new String[]{"The user is physically moving", "The user feels part of the virtual world", "The user's device is on", "None of these"},
                1
        ));

        list.add(new Question(
                "Which of the following is a wearable haptic device:",
                new String[]{"VR headset", "VR gloves", "Keyboard", "Joystick"},
                0
        ));

        list.add(new Question(
                "Touchable haptics are commonly used in",
                new String[]{"Smartphones and tablets", "Servers", "VR helmets", "Data centers"},
                0
        ));

        list.add(new Question(
                "Mid-air haptics deliver sensations using :",
                new String[]{"Electricity", "Ultrasound waves", "Heat sensors", "Vibrations only"},
                3
        ));

        list.add(new Question(
                "Which immersive technology is most used for training pilots:",
                new String[]{"AR", "VR", "MR", "XR"},
                1
        ));

        list.add(new Question(
                "Which technology provides 3D visual overlays on physical spaces:",
                new String[]{"MR", "AR", "VR", "Haptic"},
                0
        ));

        list.add(new Question(
                "XR is best described as ……",
                new String[]{"Software simulation", "The umbrella term for AR, VR, MR", "Quantum device", "Mechanical design tool"},
                1
        ));

        list.add(new Question(
                "Which industry was among the first to adopt immersive technology widely-",
                new String[]{"Education", "Gaming", "Manufacturing", "Agriculture"},
                1
        ));

        list.add(new Question(
                "Immersive technologies engage which senses-",
                new String[]{"Sight and sound", "Taste and smell", "Balance and touch", "None"},
                0
        ));

        list.add(new Question(
                "Microsoft HoloLens is an example of ……",
                new String[]{"VR device", "MR device", "AR device", "XR headset"},
                3
        ));

        list.add(new Question(
                "In education, immersive technology helps by ……",
                new String[]{"Creating physical textbooks", "Enabling virtual field trips", "Replacing teachers", "Reducing school hours"},
                1
        ));

        list.add(new Question(
                "Medical students use VR to ……",
                new String[]{"Play games", "Practice surgery in virtual environments", "Write reports", "Scan patient IDs"},
                1
        ));

        list.add(new Question(
                "AR can assist engineers by ……",
                new String[]{"Reducing machine cost", "Overlaying design elements on real components", "Replacing hardware", "Printing 3D models"},
                1
        ));

        list.add(new Question(
                "In real estate, VR enables ……",
                new String[]{"Cost estimation", "Remote property tours", "Document management", "Security scanning"},
                1
        ));

        list.add(new Question(
                "AR marketing helps customers by ……",
                new String[]{"Displaying product manuals", "Trying products virtually", "Increasing advertisements", "None"},
                1
        ));

        list.add(new Question(
                "In tourism, immersive technology offers ……",
                new String[]{"Virtual previews of destinations", "Flight discounts", "Paper tickets", "Booking apps only"},
                0
        ));

        list.add(new Question(
                "The military uses VR and AR to ……",
                new String[]{"Entertain troops", "Conduct safe training simulations", "Build bases", "None"},
                1
        ));

        list.add(new Question(
                "Healthcare uses VR for ……",
                new String[]{"Music therapy", "Pain management and mental health", "Billing", "Insurance claims"},
                1
        ));

        list.add(new Question(
                "In architecture, immersive technology allows ……",
                new String[]{"Viewing 3D models before construction", "Enhancing paper drawings", "Speeding up cement drying", "Painting walls"},
                0
        ));

        list.add(new Question(
                "AR glasses are used for ……",
                new String[]{"Showing digital info in real-world view", "Listening to audio", "Printing photos", "Transferring files"},
                0
        ));

        list.add(new Question(
                "Green computing promotes:",
                new String[]{"Energy conservation", "Faster processors", "Bigger servers", "More power usage"},
                0
        ));

        list.add(new Question(
                "Green IT mainly focuses on:",
                new String[]{"Recycling and reducing e-waste", "Expensive chips", "Cloud gaming", "Crypto mining"},
                0
        ));

        list.add(new Question(
                "Energy-efficient hardware helps by:",
                new String[]{"Increasing electricity cost", "Reducing power consumption", "Producing more heat", "degrating performance"},
                1
        ));

        list.add(new Question(
                "Which of the following is a feature of Green Computing-",
                new String[]{"High carbon footprint", "Use of renewable energy in data centers", "Increasing e-waste", "Faster clock speeds in processors"},
                1
        ));

        list.add(new Question(
                "Data centers improve cooling efficiency using ……….",
                new String[]{"Hot aisle / cold aisle layout", "Random arrangement", "Closed chambers", "Heating ducts"},
                0
        ));

        list.add(new Question(
                "Liquid cooling in data centers is used for ……….",
                new String[]{"Better heat transfer", "Soundproofing", "Data encryption", "Visual enhancement"},
                0
        ));

        list.add(new Question(
                "Virtualization helps green computing by ……….",
                new String[]{"Reducing physical servers", "Increasing storage devices", "Running fewer applications", "Wasting resources"},
                0
        ));

        list.add(new Question(
                "Green computing is also called ……….",
                new String[]{"Cloud IT", "Green IT", "Smart IT", "Energy IT"},
                1
        ));

        list.add(new Question(
                "Which of these is a benefit of green computing-",
                new String[]{"Cost savings", "High temperature", "More pollution", "Data loss"},
                0
        ));

        list.add(new Question(
                "A paperless office contributes to ……….",
                new String[]{"Waste generation", "Green computing", "Carbon increase", "None"},
                0
        ));

        list.add(new Question(
                "The first stage in e-waste management is ……….",
                new String[]{"Sorting", "Collection", "Dismantling", "Recycling"},
                1
        ));

        list.add(new Question(
                "Data destruction ensures ……….",
                new String[]{"File recovery", "Information security", "Power efficiency", "Free software"},
                1
        ));

        list.add(new Question(
                "Shredding is done to ……….",
                new String[]{"Mix components", "Break down parts for sorting", "Repair devices", "None"},
                1
        ));

        list.add(new Question(
                "Magnetic separation removes ……….",
                new String[]{"Plastic", "Steel and iron", "Copper", "Glass"},
                1
        ));

        list.add(new Question(
                "Eddy current separation targets ……….",
                new String[]{"Non-ferrous metals", "Glass", "Wood", "Paper"},
                0
        ));

        list.add(new Question(
                "Water separation helps in separating ………",
                new String[]{"Glass and plastics", "Metals", "Chemicals", "All materials"},
                0
        ));

        list.add(new Question(
                "Material recovery extracts ………",
                new String[]{"Gold, copper, silver", "Plastic, paper, wood", "Lead, mercury", "Glass only"},
                0
        ));

        list.add(new Question(
                "Hazardous waste includes ………",
                new String[]{"Plastic", "Lead, mercury, cadmium", "Paper", "Aluminum"},
                1
        ));

        list.add(new Question(
                "The purpose of e-waste recycling is to ………",
                new String[]{"Produce more e-waste", "Reduce environmental impact", "Generate new waste", "Discard all materials"},
                1
        ));

        list.add(new Question(
                "Recovered materials are used to ………",
                new String[]{"Create new electronic products", "Build buildings", "Produce paper", "Make fuel"},
                0
        ));

        list.add(new Question(
                "Quantum computing is based on ………",
                new String[]{"Quantum mechanics", "Classical physics", "Thermodynamics", "Nanotechnology"},
                0
        ));

        list.add(new Question(
                "The basic unit of quantum information is ………",
                new String[]{"Bit", "Byte", "Qubit", "Node"},
                2
        ));

        list.add(new Question(
                "Superposition allows a qubit to be ………",
                new String[]{"0 or 1", "0 and 1 simultaneously", "2 only", "None"},
                0
        ));

        list.add(new Question(
                "Entanglement means ………",
                new String[]{"Two qubits interact instantly", "Qubits separate", "Bits collide", "Data loss"},
                0
        ));

        list.add(new Question(
                "Quantum interference helps ………",
                new String[]{"Eliminate wrong solutions", "Store memory", "Increase heat", "Encrypt data"},
                0
        ));

        list.add(new Question(
                "Classical computers use ………",
                new String[]{"Qubits", "Bits", "Gates only", "Photons"},
                1
        ));

        list.add(new Question(
                "Quantum computers can solve problems ………",
                new String[]{"Sequentially", "In parallel", "Randomly", "Slowly"},
                1
        ));

        list.add(new Question(
                "Example of a quantum computer ………",
                new String[]{"IBM Quantum", "Dell Laptop", "Raspberry Pi", "Chromebook"},
                0
        ));

        list.add(new Question(
                "Quantum computing helps in ………",
                new String[]{"Drug discovery", "Game design", "Web hosting", "UI design"},
                0
        ));

        list.add(new Question(
                "Quantum Key Distribution (QKD) is used in ………",
                new String[]{"Cryptography", "AI", "Robotics", "Machine learning"},
                0
        ));

        list.add(new Question(
                "Google’s quantum computer is called ………",
                new String[]{"Titan", "Sycamore", "QuantumX", "DeepMind"},
                1
        ));

        list.add(new Question(
                "Quantum computers process information using ………",
                new String[]{"Classical gates", "Quantum gates", "Optical drives", "CPUs"},
                1
        ));

        list.add(new Question(
                "Quantum computing benefits which field most-",
                new String[]{"Optimization", "Animation", "Gaming", "Cloud hosting"},
                0
        ));

        list.add(new Question(
                "Quantum computing is still in ………",
                new String[]{"Early development stage", "Full production", "Decline", "Decommissioning"},
                0
        ));

        list.add(new Question(
                "A key difference between classical and quantum computing is ………",
                new String[]{"Speed of data transfer", "Representation of data (bits vs qubits)", "Screen resolution", "Hardware design"},
                0
        ));

        list.add(new Question(
                "In quantum computing, probability is used for ………",
                new String[]{"Observing results", "Compressing data", "Encrypting data", "Deleting files"},
                0
        ));

        list.add(new Question(
                "Quantum algorithms are faster for ………",
                new String[]{"Sorting", "Factoring large numbers", "Simple addition", "Text processing"},
                1
        ));

        list.add(new Question(
                "Which principle allows linked qubits to share information instantly-",
                new String[]{"Superposition", "Entanglement", "Holography", "Refraction"},
                1
        ));

        list.add(new Question(
                "Which area can quantum computing revolutionize-",
                new String[]{"Cybersecurity", "Photography", "Social media", "Printing"},
                0
        ));

        list.add(new Question(
                "The main challenge in building quantum computers is ………",
                new String[]{"Data storage", "Qubit stability and error correction", "Color display", "User interface"},
                1
        ));

        list.add(new Question(
                "How does AR differ from VR-",
                new String[]{"AR fully replaces the real world; VR only enhances it", "AR enhances the real world with digital overlays, VR replaces the real world", "AR and VR are the same in terms of immersion", "AR requires haptic suits while VR does not"},
                1
        ));

        list.add(new Question(
                "Why Mixed Reality (MR) is considered more advanced than AR-",
                new String[]{"MR only works on smartphones", "MR allows digital and physical objects to interact in real-time", "MR completely ignores the real environment", "MR is only used in gaming"},
                1
        ));

        list.add(new Question(
                "Which application of immersive technology is best explained by “IKEA’s AR app to visualize furniture”-",
                new String[]{"Tourism", "Retail & E-commerce", "Entertainment", "Healthcare"},
                1
        ));

        list.add(new Question(
                "Which of the following best explains server virtualization in Green Computing-",
                new String[]{"Increasing the number of servers to balance workload", "Using one physical server to host multiple virtual machines", "Reducing server speed to save energy", "Recycling old servers into new ones."},
                1
        ));

        list.add(new Question(
                "Why is quantum superposition powerful-",
                new String[]{"It reduces memory usage in computers", "It allows a qubit to exist in multiple states at once", "It eliminates the need for quantum gates", "It increases processor clock speeds"},
                0
        ));

        list.add(new Question(
                "A medical student practices surgery using a VR simulator before treating a real patient. This is an example of:",
                new String[]{"Entertainment application of VR", "Education & Training application of VR", "AR in healthcare", "Haptic feedback technology"},
                0
        ));

        list.add(new Question(
                "A soldier trains in a VR battlefield before deployment. Which immersive technology application does this represent-",
                new String[]{"Healthcare", "Tourism", "Defense & Military", "Sports & Fitness"},
                0
        ));

        list.add(new Question(
                "A smartphone provides vibration feedback when pressing a touchscreen button. This is an example of:",
                new String[]{"Augmented Reality", "Extended Reality", "Haptic Technology", "Quantum Interference"},
                0
        ));

        list.add(new Question(
                "A data center reduces cooling costs by using free air cooling and liquid cooling. This demonstrates:",
                new String[]{"Quantum computing optimization", "E-waste management", "Green Data Center Practices", "Mixed Reality in Industry"},
                0
        ));

        list.add(new Question(
                "A company wants to simulate new drug molecules to accelerate vaccine development. Which technology is most suitable-",
                new String[]{"Virtual Reality", "Quantum Computing", "Green Computing", "Mixed Reality"},
                0
        ));

    }

    private static void addChapter5(ArrayList<Question> list) {
        list.add(new Question(
                "Digital Forensics is primarily concerned with ……",
                new String[]{"building computer systems", "Preservation, identification, extraction, and documentation of computer evidence", "software development", "network installation"},
                1
        ));

        list.add(new Question(
                "………….is a branch of forensic science encompassing the recovery and investigation of material found in digital devices.",
                new String[]{"Analog forensic", "Digital forensic", "Cyber forensic", "Computer forensic"},
                0
        ));

        list.add(new Question(
                "Digital forensics helps in ……",
                new String[]{"Breaking software licenses", "Estimating potential impact of malicious activity", "Upgrading hardware", "Designing new programming languages"},
                1
        ));

        list.add(new Question(
                "Major goal of Digital Forensics is ___-",
                new String[]{"To duplicate original data and preserve original evidence.", "V alidation of digital information", "Collection of digital evidence", "All of above"},
                3
        ));

        list.add(new Question(
                "Which of the following is an objective of digital forensics-",
                new String[]{"Design UI for software", "Recover, analyze, and preserve computer materials for legal proceedings", "Develop malware", "Install operating systems"},
                1
        ));

        list.add(new Question(
                "Investigator should follow follwing rule/rules-",
                new String[]{"Computer and data on it must be protected during acquisition of the media.", "An examination should never be performed on the original media.", "Both A & B", "A is true B is False"},
                0
        ));

        list.add(new Question(
                "Which of the following is a core rule of digital forensics-",
                new String[]{"Work directly on the original evidence", "Maintain integrity and create a forensically sound copy", "Ignore documentation", "Skip chain of custody"},
                0
        ));

        list.add(new Question(
                "Forensic duplication is necessary because:",
                new String[]{"To save storage space", "To preserve the original evidence while performing analysis", "To speed up software installation", "To format drives"},
                1
        ));

        list.add(new Question(
                "Which tool is widely used for forensic imaging-",
                new String[]{"Wireshark", "Encase", "MS-Excel", "Notepad"},
                1
        ));

        list.add(new Question(
                "Forensic triage is performed to:",
                new String[]{"Repair broken hardware", "Quickly assess and prioritize evidence", "Encrypt files", "Install antivirus software"},
                1
        ));

        list.add(new Question(
                "Metadata in digital evidence includes:",
                new String[]{"Data about data (Creation time, author, last modified )", "File content only", "File size Only", "IP addresses only"},
                0
        ));

        list.add(new Question(
                "Imaging a storage device ensures ……",
                new String[]{"Deletion of all files", "An exact bit-by-bit copy of data", "Faster internet speed", "Encryption of files"},
                1
        ));

        list.add(new Question(
                "Hashing in digital forensics is used to:",
                new String[]{"Compress data", "Verify integrity of digital evidence", "Encrypt emails", "Convert files to PDFs"},
                1
        ));

        list.add(new Question(
                "Which model is used for real-time or live forensic analysis-",
                new String[]{"DFRWS", "Live Forensic Model", "IDIP", "ADFM"},
                1
        ));

        list.add(new Question(
                "Foot printing in ethical hacking is done to...",
                new String[]{"Plant malware", "Gather preliminary information about the target", "delete user accounts", "crack passwords only"},
                1
        ));

        list.add(new Question(
                "Scanning in hacking helps to:",
                new String[]{"Exploit vulnerabilities", "Identify open ports, services, and weak points", "Encrypt the network", "Create a backup"},
                1
        ));

        list.add(new Question(
                "Enumeration phase involves:",
                new String[]{"Listing potential targets and system details", "Installing antivirus", "Performing backups", "Writing reports only"},
                0
        ));

        list.add(new Question(
                "Post-exploitation phase is for:",
                new String[]{"Restoring system data", "Maintaining access, covering tracks, and extracting data", "Scanning the system", "Running antivirus"},
                1
        ));

        list.add(new Question(
                "What is the first stage in digital forensics investigation-",
                new String[]{"Analysis", "Documentation", "Identification", "Presentation"},
                2
        ));

        list.add(new Question(
                "Which stage involves creating a forensic image of the digital evidence-",
                new String[]{"Identification", "Preservation / Extraction", "Documentation", "Presentation"},
                0
        ));

        list.add(new Question(
                "Which step of digital forensics focuses on freezing the crime scene digitally-",
                new String[]{"Analysis", "Preservation", "Documentation", "Collection"},
                1
        ));

        list.add(new Question(
                "Why is evidence preservation important in digital forensics-",
                new String[]{"To compress data", "To maintain its integrity for legal acceptance", "To speed up recovery", "To allow duplication"},
                1
        ));

        list.add(new Question(
                "The “Preservation” phase in any forensic model involves:",
                new String[]{"Collecting evidence and maintaining chain of custody", "Writing reports only", "Installing software patches", "Monitoring network traffic"},
                0
        ));

        list.add(new Question(
                "In digital forensics, ______ values are used to ensure data integrity.",
                new String[]{"Checksum", "Hash", "Packet", "Cipher"},
                1
        ));

        list.add(new Question(
                "Which of the following are sources of digital evidences-",
                new String[]{"Internet based files", "Stand-alone computers or devices", "Mobile devices", "All of the above"},
                3
        ));

        list.add(new Question(
                "During evidence handling, why is a chain of custody important-",
                new String[]{"To reduce paperwork", "To prove evidence integrity and control", "To speed up the investigation", "To delete irrelevant files"},
                1
        ));

        list.add(new Question(
                "What is/are the procedural steps to establish chain of Custody-",
                new String[]{"Work with original evidence", "Perform a hash test analysis", "Alter the state of evidence", "Declare the confidential matters"},
                0
        ));

        list.add(new Question(
                "Why it is important to maintain the Chain of Custody-",
                new String[]{"To preserve the integrity of the evidence", "To prevent it from contamination", "To maintain the state of evidence", "All of the above"},
                3
        ));

        list.add(new Question(
                "Write the Correct sequence steps of procedure to establish the Chain of Custody- 1. Save the original materials 2. Perform a hash test analysis to further authenticate the working clone 3. Take screenshot of digital evidence content 4. Inject bit by bit clone of digital evidence content into our forensic computers",
                new String[]{"Sequence of Steps 1,2,3,4", "Sequence of Steps 1,3,4,2", "Sequence of steps 2,3,4,1", "Sequence of steps 3,4,1,2"},
                0
        ));

        list.add(new Question(
                "Volatile data in digital forensics refers to ……",
                new String[]{"Hard disk data", "Data in RAM that may be lost if not captured properly", "Data stored in external drives", "Encrypted data only"},
                1
        ));

        list.add(new Question(
                "The DFRWS model was proposed in ……",
                new String[]{"1999", "2001", "2005", "2010"},
                1
        ));

        list.add(new Question(
                "The DFRWS model belongs to-",
                new String[]{"Digital forensic investigation", "Operating system hacking", "Web application development", "Network protocol testing"},
                0
        ));

        list.add(new Question(
                "ADFM stands for……-",
                new String[]{"Analog Digital Forensic Model", "Abstract Digital Forensic Model", "Abstract Discrete Forensic Model", "Analog Discrete Forensic Model"},
                1
        ));

        list.add(new Question(
                "EMCI means……….-",
                new String[]{"Extended Model for Cybercrime Investigation", "Electronic Model for Cybercrime Invention", "Extended Mode for Cybercrime Investigation", "Emergency Model for Cybercrime Investigation"},
                0
        ));

        list.add(new Question(
                "UMDFPM stands for ……",
                new String[]{"Unified Model of Digital Forensic Process", "UML Modeling of Digital Forensic Process Model", "Universal Method for Digital Police", "Unified Module for Digital Protection"},
                1
        ));

        list.add(new Question(
                "Which model adds Preparation and Return of Evidence phases-",
                new String[]{"DFRWS Model", "ADFM", "IDIP", "EEDIP"},
                1
        ));

        list.add(new Question(
                "Identify Forensic Model in given fig-",
                new String[]{"IDIP", "EMCI", "Waterfall", "ADFM"},
                3
        ));

        list.add(new Question(
                "In ADFM, Which phase is used to provide summary and explaination of conclusion-",
                new String[]{"Approach Strategy", "Presentation", "Preservation", "Analysis"},
                1
        ));

        list.add(new Question(
                "In ADFM model,The preparation of tools,techniques,search warrants are functions of which phase-",
                new String[]{"Collection", "Examination", "Preservation", "Preparation"},
                3
        ));

        list.add(new Question(
                "The IDIP model integrates ……",
                new String[]{"only digital evidence", "Both digital and physical crime scene investigations", "only network attacks", "only legal documentation"},
                1
        ));

        list.add(new Question(
                "Integrated Digital Investigation Process (IDIP) mainly focuses on-",
                new String[]{"OS patching", "Cloud backup", "Data encryption", "Linking physical and digital crimes"},
                3
        ));

        list.add(new Question(
                "In IDIP Model, to provide mechanism to an incident to be detected and confirmed is purpose of which phase-",
                new String[]{"Review phase", "Physical crime investigation", "Deployment phase", "Digital crime investigation."},
                2
        ));

        list.add(new Question(
                "Which phase of IDIP model includes Detection & Notification Phase-",
                new String[]{"Deployment Phase", "Physical Crime Investigation", "Readiness", "Review phase"},
                0
        ));

        list.add(new Question(
                "In IDIP Model, Which phase is used to put the pieces of digital puzzle together and developing investigative hypotheses.-",
                new String[]{"Review phase", "Presentation phase", "Reconstruction phase", "Notification phase"},
                3
        ));

        list.add(new Question(
                "In IDIP,Digital crime investigation phase includes ……………..-",
                new String[]{"Survey phase", "Documentation phase", "Search and collection phase", "All of above"},
                3
        ));

        list.add(new Question(
                "In Digital Forensic, Planning, Transport of Evidence and Presentation of hypothesis are phases of ……….model-",
                new String[]{"ADFM", "EMCI", "IDIP", "None of these"},
                1
        ));

        list.add(new Question(
                "Hypothesis is the phase of which forensic model",
                new String[]{"ADFM", "EMCI", "IDIP", "RoadMap"},
                3
        ));

        list.add(new Question(
                "Which model is suitable for multi-agency cybercrime cases requiring structured communication-",
                new String[]{"DFRWS", "Extended Model for Cybercrime Investigation", "ADFM", "IDIP"},
                1
        ));

        list.add(new Question(
                "Which model focuses on end-to-end traceability and automated documentation-",
                new String[]{"DFRWS Model", "EEDIP", "UMDFPM", "ADFM"},
                1
        ));

        list.add(new Question(
                "Which model emphasizes legal admissibility of evidence from start to end-",
                new String[]{"DFRWS", "ADFM", "IDIP", "EEDIP"},
                2
        ));

        list.add(new Question(
                "Black-hat hacking is………..",
                new String[]{"Legal tester of systems", "Malicious hackers exploiting vulnerabilities for personal gain", "Students learning hacking", "Cyber security officers"},
                1
        ));

        list.add(new Question(
                "Blue Hat hackers are usually:",
                new String[]{"Internal corporate testers before software release", "Malicious hackers", "Government hackers", "Script kiddies"},
                0
        ));

        list.add(new Question(
                "Script kiddies are:",
                new String[]{"Experienced hackers", "Unskilled attackers using pre-made tools.", "Government cybersecurity professionals", "AI based attack tools"},
                1
        ));

        list.add(new Question(
                "Hacktivists are motivated by:",
                new String[]{"Money", "Political or social causes", "Corporate espionage", "Virus creation"},
                1
        ));

        list.add(new Question(
                "State-sponsored hackers are:",
                new String[]{"Ethincal testers", "Government-backed attackers for espionage or cyberwarfare", "Students learning hacking", "Penetration testers."},
                1
        ));

        list.add(new Question(
                "Which hacker type acts legally to help organizations secure systems-",
                new String[]{"Black Hat", "White Hat", "Grey Hat", "Blue Hat"},
                1
        ));

        list.add(new Question(
                "Which hacker type may access systems without permission but without malicious intent-",
                new String[]{"White Hat", "Grey Hat", "Red Hat", "Green Hat"},
                1
        ));

        list.add(new Question(
                "A hacker who identifies and exploits weaknesses in telephones instead of computers is called as…..………",
                new String[]{"White hat hacker", "Black hat hacker", "Phreaker", "Hacktivist"},
                0
        ));

        list.add(new Question(
                "The skilled criminal experts who write some of the hacking tools, including the scripts and other programs that the script kiddies and security professionals use are known as……………..",
                new String[]{"Hacktivist", "Criminal Hackers", "Script Kiddies", "Security Researchers"},
                1
        ));

        list.add(new Question(
                "A Red Hat Hacker is known for ……",
                new String[]{"creating malware for profit", "Aggressively stopping black hat hackers", "learning hacking as a beginner", "ethical penetration testing"},
                0
        ));

        list.add(new Question(
                "Ethical hacking is ……",
                new String[]{"Illegal hacking for personal gain", "Authorized testing of systems to identify vulnerabilities", "Installing malware", "Ignoring security measures"},
                1
        ));

        list.add(new Question(
                "Ethical Hacking is…………..",
                new String[]{"Identifying weakness in computer systems and/or computer networks and coming up with counter measures that protect the weaknesses.", "Identifying weakness in programmer and coming up with counter measures that protect the weaknesses.", "Identifying weakness in only software and attacking the same.", "Enforcing the weakness in computer systems."},
                0
        ));

        list.add(new Question(
                "Using password cracking algorithm to gain access to a system is an example of …………",
                new String[]{"Security auditing", "Ethical hacking", "System engineering", "Social engineering"},
                0
        ));

        list.add(new Question(
                "..……..is performed with the target’s permission in a professional setting.",
                new String[]{"Ethical hacking", "Social engineering", "System Engineering", "Software Testing"},
                0
        ));

        list.add(new Question(
                "Sequential steps hackers uses are: __, ___, __, __ A. Maintaining Access B. Reconnaissance C. Scanning D. Gaining Access",
                new String[]{"B, C, D, A", "B, A, C, D", "A, B, C, D", "D, C, B, A"},
                0
        ));

        list.add(new Question(
                "Phases of Ethical Hacking do NOT include ……",
                new String[]{"Reconnaissance", "Scanning", "System destruction", "Reporting and analysis"},
                2
        ));

        list.add(new Question(
                "The intent of ethical hacking is…………..",
                new String[]{"To discover the hacker who hacks the secure systems.", "To promote the malicious attacker’s hack to better secure systems.", "To discover vulnerabilities from a malicious attacker’s viewpoint to better secure systems.", "To introduce vulnerabilities into better secure systems."},
                0
        ));

        list.add(new Question(
                "The goal of ethical hacker is to hack a system in a…………..",
                new String[]{"Non-destructive fashion", "Destructive fashion", "Highly destructive fashion", "Corruptive fashion"},
                0
        ));

        list.add(new Question(
                "To catch a thief, think like a thief. That’s the basis for………",
                new String[]{"Security testing", "Ethical hacking", "Configuration testing", "Performance testing"},
                0
        ));

        list.add(new Question(
                "What do the Cyberterrorists do-",
                new String[]{"They are skilled criminal experts who write some of the hacking tools, including the scripts and other programs that the script kiddies and security professionals use.", "They are highly technical and publicly known security experts who not only monitor and track computer, network, and application vulnerabilities but also write the tools and other code to exploit them.", "Attack corporate or government computers and public utility infrastructures, such as power grids and air traffic control towers.", "They are computer novices who take advantage of the exploit tools, vulnerability scanners, and documentation available free on the Internet but who don’t have any real"},
                2
        ));

        list.add(new Question(
                "………is the art of exploiting the human elements to gain access to unauthorised resources",
                new String[]{"Social Engineering.", "IT Engineering.", "Software testing", "Ethical Hacking."},
                0
        ));

        list.add(new Question(
                "Which of the following is an AI-powered attack-",
                new String[]{"Ransomware 2.0", "Deepfake phishing", "OS downgrade attack", "Firmware exploit"},
                1
        ));

        list.add(new Question(
                "Ransomware 2.0 is known for ……",
                new String[]{"Encrypting files only", "Encrypting and exfiltrating data for double / triple extortion", "Exploiting network devices", "Downgrading OS"},
                1
        ));

        list.add(new Question(
                "IoT exploits typically involve ……",
                new String[]{"Social engineering only", "Insecure devices used for attacks or botnets", "Application layer bypass", "Red Hat hacking"},
                1
        ));

        list.add(new Question(
                "Zero-day exploits are ……",
                new String[]{"Known vulnerabilities with patches", "Unknown vulnerabilities with no patches available", "OS downgrade techniques", "Only web application issues"},
                1
        ));

        list.add(new Question(
                "Advanced WAF bypass attacks target ……",
                new String[]{"Operating System", "Web applications", "IoT devices", "Firmware only"},
                1
        ));

        list.add(new Question(
                "Deep fake technology is associated with:",
                new String[]{"Video/Audio manipulation", "Password cracking", "Firmware upgrade", "Hardware design"},
                0
        ));

        list.add(new Question(
                "AI-powered phishing scams belong to the category of ______ hacking.",
                new String[]{"Application", "Network", "Operating system", "Firmware"},
                1
        ));

        list.add(new Question(
                "What it called when an unknown vulnerability is exploited before the vendor releases a patch.",
                new String[]{"Zero-day exploits", "Ransomware", "Deep fake misuse", "Chain of custody error"},
                0
        ));

        list.add(new Question(
                "Phishing attacks aim to:",
                new String[]{"Send spam", "Trick users into revealing sensitive information", "Encrypt files", "Scan network"},
                1
        ));

        list.add(new Question(
                "Ransomware attacks primarily involve:",
                new String[]{"Stealing identities", "Encrypting user data and demanding ransom", "Crashing websites", "Spamming emails"},
                1
        ));

        list.add(new Question(
                "IoT botnets are used to:",
                new String[]{"Launch DDoS attacks", "Encrypt files", "Test network speed", "Clean devices"},
                0
        ));

        list.add(new Question(
                "Malware is:",
                new String[]{"Authorized software", "Malicious software designed to disrupt or damage", "Antivirus software", "Operating system upgrade"},
                1
        ));

        list.add(new Question(
                "Zero-day attacks are dangerous because:",
                new String[]{"They use old vulnerabilies", "There is no patch available yet", "There are easy to prevent", "They target only students"},
                3
        ));

        list.add(new Question(
                "National Cyber Security Policy (NCSP) 2013 aims to ……",
                new String[]{"Increase internet speed in India", "Protect public and private infrastructure from cyber attacks", "Ban all social media", "Create malware"},
                1
        ));

        list.add(new Question(
                "IT Act 2000 primarily deals with ……",
                new String[]{"Hardware design", "Electronic records, digital signatures, and cybercrime", "Building networks", "Installing OS updates"},
                1
        ));

        list.add(new Question(
                "In Section 65, Tampering with computer source documents leads to the penalty as :",
                new String[]{"Imprisonment up to three years, or/and with fine up to ₹200,000.", "Imprisonment up to three years, or/and with fine up to ₹100,000", "Imprisonment up to three years, or/and with fine up to ₹500,000", "Imprisonment up to life."},
                0
        ));

        list.add(new Question(
                "The Digital Personal Data Protection Act (DPDP) 2023 ensures:",
                new String[]{"Free access to all data.", "Encourages phishing attacks.", "Lawful processing of personal data with consent", "Deletion of all user data automatically"},
                2
        ));

        list.add(new Question(
                "CCPWC Scheme (2018) focuses on:",
                new String[]{"Cybercrime prevention against women and children", "Reducing malware attacks", "Ethical Hacking training only", "IOT security"},
                0
        ));

        list.add(new Question(
                "Which section of IT Act 2000 deals with hacking and computer offenses",
                new String[]{"Section 43", "Section 66", "Section 72A", "Section 69"},
                1
        ));

        list.add(new Question(
                "The IT (Amendment) Act 2008 introduced:",
                new String[]{"Only digital signatures", "Cybercrime provision including identity theft, phishing & cyber terrorism", "Internet connectivity rules", "Hardware standards"},
                1
        ));

        list.add(new Question(
                "Digital personal data protection Act (DPDP) 2023 replaced……",
                new String[]{"IT Act 2000 completely", "Some provisions related to personal data protection under IT Act", "Only Copyright law", "Cybercrime section"},
                1
        ));

        list.add(new Question(
                "Cybercrime against women & children is covered under:",
                new String[]{"IT Act Section 43", "IT Act 66A/66B & CCPWC Scheme", "DPDP Act only", "NCSP only"},
                1
        ));

        list.add(new Question(
                "Law that mandates consent for collecting personal data-",
                new String[]{"IT Act 2000", "DPDP Act 2023", "CCPWC Scheme", "NCSP 2013"},
                1
        ));

        list.add(new Question(
                "NCSP 2013 was formulated by:",
                new String[]{"UNESCO", "Government of India", "Private companies", "Ethical hackers"},
                1
        ));

        list.add(new Question(
                "Which IT Act amendment introduced the Digital Personal Data Protection (DPDP) Act-",
                new String[]{"2000", "2008", "2023", "2013"},
                2
        ));

        list.add(new Question(
                "Police investigating online child exploitation cases would rely on which scheme-",
                new String[]{"NCSP 2013", "IT Act 2000", "CCPWC 2018", "DPDP 2023"},
                2
        ));

        list.add(new Question(
                "A company discovers its employees are receiving AI-generated phishing emails, which type of hacking is this-",
                new String[]{"OS hacking", "Application hacking", "Network hacking", "Firmware hacking"},
                0
        ));

        list.add(new Question(
                "If an attacker uses a deep fake voice to trick a bank employee into transferring money, this attack can be classified as-",
                new String[]{"Network phishing", "Social engineering with AI exploits", "Firmware attack", "OS downgrade attack"},
                0
        ));

        list.add(new Question(
                "A forensic investigator is analyzing encrypted ransomware files. The encryption key was deleted by the attacker. To prove the case in court, which forensic step is most critical-",
                new String[]{"Collection", "Chain of custody", "Preservation", "Presentation"},
                0
        ));

        list.add(new Question(
                "A financial company’s servers are encrypted by a ransomware gang. Attackers demand crypto currency payment and threaten to leak confidential customer data if the ransom is not paid.Identify the type of hacking involved in this case.",
                new String[]{"Application hacking", "Network hacking – Ransomware 2.0", "Firmware exploits", "OS downgrade attack"},
                0
        ));

        list.add(new Question(
                "A multinational company handling Indian citizen’s personal data fails to comply with the DPDP Act 2023. Which risk do they face-",
                new String[]{"Cyber forensic investigation", "Legal penalties and restrictions on data processing", "Ethical hacking mandates", "NCSP 2013 enforcement"},
                0
        ));

    }

}
