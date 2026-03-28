package com.example.mcqforut1.data;

import com.example.mcqforut1.model.Question;

import java.util.ArrayList;
import java.util.Collections;

public class ManQuestionBank {

    public static ArrayList<Question> getQuestionsByChapter(int chapter) {
        ArrayList<Question> list = new ArrayList<>();

        if (chapter == 3) {
            addUnit3(list);
        } else if (chapter == 4) {
            addUnit4(list);
        } else if (chapter == 5) {
            addUnit5(list);
        }

        Collections.shuffle(list);
        return list;
    }

    private static void addUnit3(ArrayList<Question> list) {
        list.add(new Question(
                ". The main purpose of a Quality Circle is to",
                new String[]{"Solve workplace problems through teamwork", "Conduct financial audits", "Replace management", "Supervise marketing activities."},
                0
        ));

        list.add(new Question(
                ". Quality Circles operate on the principle of",
                new String[]{"Hierarchical control", "Employee participation and empowerment", "Autocratic leadership", "External consultancy"},
                1
        ));

        list.add(new Question(
                ". The concept of Quality Circles originated in",
                new String[]{"USA", "Japan", "Germany", "India"},
                1
        ));

        list.add(new Question(
                ". The founder of the Quality Circle concept is",
                new String[]{"Kaoru Ishikawa", "W. Edwards Deming", "Joseph Juran", "F. W. Taylor"},
                0
        ));

        list.add(new Question(
                ". A typical Quality Circle includes",
                new String[]{"5-10 members from the same department", "Only managers", "Outsiders and consultants", "Directors and shareholders"},
                0
        ));

        list.add(new Question(
                ". Quality Circles aim at",
                new String[]{"Developing creativity and problem-solving skills", "Punishing poor performers", "Cutting salaries", "Reducing communication"},
                0
        ));

        list.add(new Question(
                ". The main outcome of a Quality Circle meeting is",
                new String[]{"New rules", "Suggestions for improvement", "Promotions", "Financial reports"},
                1
        ));

        list.add(new Question(
                ". Which of these tools is often used in Quality Circles-",
                new String[]{"Fishbone diagram", "Balance sheet", "SWOT matrix only", "Ledger book"},
                0
        ));

        list.add(new Question(
                ". Quality Circles were first introduced in India at",
                new String[]{"BHEL", "Tata Steel", "Indian Railways", "Hindustan Motors"},
                0
        ));

        list.add(new Question(
                ". The ultimate benefit of Quality Circles is",
                new String[]{"Improved quality and productivity", "Higher bureaucracy", "Increased absenteeism", "Less employee involvement"},
                0
        ));

        list.add(new Question(
                ". Quality Circles promote which management approach-",
                new String[]{"Bottom-up", "Top-down", "Centralized", "Bureaucratic"},
                0
        ));

        list.add(new Question(
                ". The term Kaizen means",
                new String[]{"Continuous improvement", "Sudden innovation", "Large-scale change", "Temporary solution"},
                0
        ));

        list.add(new Question(
                ". Kaizen is a concept developed in",
                new String[]{"China", "Japan", "USA", "France"},
                1
        ));

        list.add(new Question(
                ". The philosophy of Kaizen emphasizes",
                new String[]{"Small improvements made regularly", "Major one-time reforms", "Only technology upgrades i", "Top management control"},
                0
        ));

        list.add(new Question(
                ". Which statement is TRUE about Kaizen-",
                new String[]{"It depends only on expensive equipment", "It requires employee involvement at all levels", "It ignores small changes", "It is used only in manufacturing"},
                1
        ));

        list.add(new Question(
                ". The main goal of Kaizen is to",
                new String[]{"Maintain current standards", "Achieve continuous betterment", "Increase cost", "Focus on individuals only"},
                1
        ));

        list.add(new Question(
                ". Which Japanese management practice is closely related to Kaizen-",
                new String[]{"Just-in-Time (JIT)", "Benchmarking", "Outsourcing", "Downsizing"},
                0
        ));

        list.add(new Question(
                ". Which of the following is NOT a principle of Kaizen-",
                new String[]{"Involve everyone", "Think improvement every day", "Blame employees for mistakes", "Eliminate waste"},
                2
        ));

        list.add(new Question(
                ". The PDCA cycle (Plan-Do-Check-Act) is associated with",
                new String[]{"Kaizen", "TQM", "Six Sigma", "Both A and B"},
                3
        ));

        list.add(new Question(
                ". Six Sigma aims to",
                new String[]{"Reduce defects and variation", "Increase wastage", "Limit employee participation", "Focus on hierarchy"},
                0
        ));

        list.add(new Question(
                ". Six Sigma was developed by",
                new String[]{"Motorola", "Toyota", "General Electric", "Ford"},
                0
        ));

        list.add(new Question(
                ". The statistical goal of Six Sigma is",
                new String[]{"3.4 defects per mllion opportunities", "100 defects per million", "99% accuracy", "Zero defects"},
                0
        ));

        list.add(new Question(
                ". The term \"Sigma\" represents",
                new String[]{"Standard deviation", "Mean value", "Frequency", "Total quality"},
                0
        ));

        list.add(new Question(
                ". Six Sigma focuses on",
                new String[]{"Data-driven decision-making", "Guesswork", "Top-level authority only", "Financial auditing"},
                0
        ));

        list.add(new Question(
                ". In Six Sigma, Green Belts are",
                new String[]{"Employees trained to support improvement projects", "Senior executives", "Accountants", "Temporary workers"},
                0
        ));

        list.add(new Question(
                ". Black Belts in Six Sigma are",
                new String[]{"Team leaders and experts who mentor others", "New interns", "Managers of HR department", "Outsiders"},
                0
        ));

        list.add(new Question(
                ". The main focus of Six Sigma is",
                new String[]{"Customer satisfaction through defect prevention", "Product advertising", "Financial reporting", "Staff reduction"},
                0
        ));

        list.add(new Question(
                ". The ultimate goal of Six Sigma is to achieve",
                new String[]{"99.99966% accuracy", "80% efficiency", "Average quality", "Maximum supervision"},
                0
        ));

        list.add(new Question(
                ". TQM stands for",
                new String[]{"Total Quality Management", "Technical Quality Measurement", "Team Quality Monitoring", "Total Quantity Management"},
                0
        ));

        list.add(new Question(
                ". The key objective of TQM is",
                new String[]{"Continuous improvement and customer satisfaction", "Cost cutting only", "Bureaucratic control", "Quick profit"},
                0
        ));

        list.add(new Question(
                ". The foundation of TQM lies in",
                new String[]{"Quality at every stage", "Inspection only", "Blaming workers", "Reducing production"},
                0
        ));

        list.add(new Question(
                ". TQM requires participation of",
                new String[]{"All employees", "Only managers", "Only production staff", "External consultants"},
                0
        ));

        list.add(new Question(
                ". The famous 14 points of quality management were proposed by",
                new String[]{"W. Edwards Deming", "Joseph Juran", "Kaoru Ishikawa", "Philip Crosby"},
                0
        ));

        list.add(new Question(
                ". Fitness for use\" definition of quality was given by",
                new String[]{"Juran", "Deming", "Taylor", "Crosby"},
                0
        ));

        list.add(new Question(
                ". The \"Zero Defect\" concept was given by",
                new String[]{"Philip Crosby", "Ishikawa", "Juran", "Deming"},
                0
        ));

        list.add(new Question(
                ". TOM promotes",
                new String[]{"Customer-driven organization", "Profit-driven only", "Technology-driven only", "Manager-driven"},
                0
        ));

        list.add(new Question(
                ". TQM emphasizes the use of",
                new String[]{"Quality tools like Pareto chart, Histogram, Check Sheet", "Financial tools", "Advertising campaigns", "Stock analysis"},
                0
        ));

        list.add(new Question(
                ". Which of the following is NOT an element of TQM-",
                new String[]{"Continuous improvement", "Employee participation", "Customer focus", "Rigid hierarchy"},
                3
        ));

        list.add(new Question(
                ". The main purpose of 5S is to",
                new String[]{"Increase sales", "Organize the workplace and improve efficiency", "Hire more workers", "Reduce salaries"},
                1
        ));

        list.add(new Question(
                ".5S originated in which country-",
                new String[]{"China", "USA", "Japan", "Germany"},
                2
        ));

        list.add(new Question(
                ". In 5S, \"Seiri\" stands for",
                new String[]{"Set in order", "Sort-remove unnecessary items", "Shine- clean the areai", "Sustain- maintain standards"},
                0
        ));

        list.add(new Question(
                ". \"Seiso\" refers to",
                new String[]{"Keeping the workplace neat and clean", "Sorting out materials", "Labeling items", "Conducting audits"},
                0
        ));

        list.add(new Question(
                ". The main benefit of 5S is",
                new String[]{"Lower product quality", "Clean, safe and efficient workplace", "Increased paperwork", "Less teamwork"},
                1
        ));

        list.add(new Question(
                ". The goal of \"Set in Order is to",
                new String[]{"Arrange items so they are easy to find and return", "Store everything randomly", "Remove all tools from the area", "Paint the walls"},
                0
        ));

        list.add(new Question(
                ". The word Kanban is derived from which language-",
                new String[]{"English", "Japanese", "Chinese", "Korean"},
                1
        ));

        list.add(new Question(
                ". The meaning of \"Kanban\" is",
                new String[]{"Visual signal or card", "Machine maintenance", "Work scheduling software", "Raw material storage"},
                0
        ));

        list.add(new Question(
                ". The Kanban system was first developed by",
                new String[]{"Motorola", "Toyota Motor Corporation", "Ford Motor Company", "General Electric"},
                1
        ));

        list.add(new Question(
                ". The main purpose of a Kanban System is to",
                new String[]{"Increase inventory levels", "Control production and material flow visually", "Increase paperwork", "Delay production"},
                1
        ));

        list.add(new Question(
                ". TPM stands for",
                new String[]{"Total Product Maintenance", "Total Productive Maintenance", "Total Process Management", "Total Preventive Management"},
                1
        ));

        list.add(new Question(
                ". The main objective of TPM is to",
                new String[]{"Increase machine breakdowns", "Maximize equipment efficiency and eliminate losses", "Increase supervision", "Reduce operator involvement"},
                1
        ));

    }

    private static void addUnit4(ArrayList<Question> list) {
        list.add(new Question(
                ". Marketing Management mainly involves .",
                new String[]{"Only selling products", "Planning, organizing, directing and controlling marketing activities", "Managing only finance and production", "Delivering services without promotion"},
                1
        ));

        list.add(new Question(
                ". The main aim of marketing management is to .",
                new String[]{"Increase costs", "Satisfy customer needs and achieve business goals", "Produce as much as possible without demand", "Focus only on pricing"},
                1
        ));

        list.add(new Question(
                ". Who defined marketing management as \"the process of planning and executing the conception, pricing, promotion and distribution of ideas, goods and services\"-",
                new String[]{"Peter Drucker", "Philip Kotler", "Henry Fayol", "F.W. Taylor"},
                1
        ));

        list.add(new Question(
                ". According to Stanton, marketing management involves .",
                new String[]{"Only advertising and sales", "Planning, organizing, directing and controlling exchange activities", "Financial decision-making", "Human resource management"},
                1
        ));

        list.add(new Question(
                ". Marketing management connects the company with .",
                new String[]{"The government", "The suppliers", "The customers", "The employees only"},
                2
        ));

        list.add(new Question(
                ". Marketing management focuses on building .",
                new String[]{"Machinery", "Strong customer relationships", "Employee unions", "Government ties"},
                1
        ));

        list.add(new Question(
                ". In simple terms, marketing management means .",
                new String[]{"Managing only advertisements", "Managing all marketing activities for business success", "Controlling employee attendance", "Creating only product designs"},
                1
        ));

        list.add(new Question(
                ". The heart of business success, according to marketing management, is .",
                new String[]{"Production", "Marketing", "Finance", "Accounting"},
                1
        ));

        list.add(new Question(
                ". The first step in effective marketing management is .",
                new String[]{"Pricing the product", "Identifying customer needs", "Advertising", "Recruiting employees"},
                1
        ));

        list.add(new Question(
                ". Marketing management helps in creating demand through .",
                new String[]{"Promotions and advertising", "Cost cutting", "Employee training", "Product maintenance"},
                0
        ));

        list.add(new Question(
                ". Marketing management encourages companies to develop .",
                new String[]{"Outdated products", "New and innovative products", "Only cheap products", "Products with no packaging"},
                1
        ));

        list.add(new Question(
                ". Efficient distribution in marketing ensures products reach .",
                new String[]{"Suppliers on time", "Customers at the right place and right time", "Government agencies", "Competitors"},
                1
        ));

        list.add(new Question(
                ". Customer satisfaction and loyalty are achieved by .",
                new String[]{"Ignoring customer feedback", "Overcharging customers", "Providing value and good relationships", "Avoiding service after sales"},
                2
        ));

        list.add(new Question(
                ". Marketing helps in facing competition by .",
                new String[]{"Copying competitors' products", "Studying the market and developing better strategies", "Ignoring customer needs", "Reducing product quality"},
                1
        ));

        list.add(new Question(
                ". Which of the following is a contribution of marketing to the economy-",
                new String[]{"Job creation and trade growth", "Reduction in innovation", "Lower employment", "Limiting product variety"},
                0
        ));

        list.add(new Question(
                ". Marketing management helps in efficient use of resources by .",
                new String[]{"Focusing only on profitable markets", "Ignoring consumer feedback", "Using manpower randomly", "Producing more than required"},
                0
        ));

        list.add(new Question(
                ". Brand image building through marketing means .",
                new String[]{"Creating a negative reputation", "Building a positive public perception", "Focusing only on pricing", "Avoiding advertisements"},
                1
        ));

        list.add(new Question(
                ". The 7 Ps model was expanded from the original .",
                new String[]{"3 Ps", "4 Ps", "5 Ps", "6 Ps"},
                1
        ));

        list.add(new Question(
                ". Which of the following is NOT part of the 7 Ps of marketing-",
                new String[]{"Product", "People", "Promotion", "Partnership"},
                3
        ));

        list.add(new Question(
                ". 'Product' in marketing mix refers to .",
                new String[]{"Advertising methods", "Goods or services offered to customers", "Company profit goals", "Employee performance"},
                1
        ));

        list.add(new Question(
                ". 'Price' in the 7 Ps represents .",
                new String[]{"Company investment", "Amount customers pay for the product", "Employee salary", "Factory cost only"},
                1
        ));

        list.add(new Question(
                ". 'Place' in marketing refers to .",
                new String[]{"Location where products are stored only", "Distribution channels used to reach customers", "Only retail shops", "Manufacturing plants"},
                1
        ));

        list.add(new Question(
                ". Which element of the 7 Ps involves advertising, sales promotion and public relations-",
                new String[]{"Product", "Promotion", "Process", "People"},
                1
        ));

        list.add(new Question(
                ". 'People' in the marketing mix includes .",
                new String[]{"Only customers", "Employees, sales staff and service providers", "Only management", "Suppliers"},
                1
        ));

        list.add(new Question(
                ". 'Physical Evidence' in marketing refers to .",
                new String[]{"Tangible elements that represent service quality", "Company budget", "Human behavior", "Legal proof"},
                0
        ));

        list.add(new Question(
                ". In marketing, \"needs\" are defined as .",
                new String[]{"Things that people desire for luxury", "Basic human requirements for survival and well-being", "Cultural preferences", "Marketing products sold by companies"},
                1
        ));

        list.add(new Question(
                ". Which of the following is NOT a basic human need-",
                new String[]{"Food", "Shelter", "Respect", "Television"},
                3
        ));

        list.add(new Question(
                ". Wants are best described as .",
                new String[]{"The same for all humans", "Specific preferences influenced by culture and personality", "Completely independent of needs", "Fixed and unchanging"},
                1
        ));

        list.add(new Question(
                ". When a person has both desire and ability to pay for a product, it is called .",
                new String[]{"Need", "Want", "Demand", "Expectation"},
                2
        ));

        list.add(new Question(
                ". According to marketing principles, the starting point of marketing is .",
                new String[]{"The product", "The promotion", "Understanding customer needs", "The distribution channel"},
                2
        ));

        list.add(new Question(
                ". A person feels hungry  this is an example of .",
                new String[]{"A want", "A demand", "A need", "A product"},
                2
        ));

        list.add(new Question(
                ". A customer wanting to buy a pizza instead of home-cooked food shows .",
                new String[]{"A need", "A want", "A demand", "A desire"},
                1
        ));

        list.add(new Question(
                ". When someone orders a Dominos pizza using their salary money, it becomes a .",
                new String[]{"Need", "Want", "Demand", "Preference"},
                2
        ));

        list.add(new Question(
                ". Which statement correctly shows the relationship between the three-",
                new String[]{"Demand -> Want -> Need", "Need -> Want -> Demand", "Want -> Demand -> Need", "Need -> Demand -> Want"},
                1
        ));

        list.add(new Question(
                ". Marketing begins not with products but with .",
                new String[]{"Pricing", "Advertising", "Customer needs", "Profit"},
                2
        ));

        list.add(new Question(
                ". A customer saying, \"I want a cheap mobile phone\", refers to .",
                new String[]{"Secret need", "Stated need", "Delight need", "Unstated need"},
                1
        ));

        list.add(new Question(
                ". A customer actually requiring a durable, long-lasting mobile phone refers to a .",
                new String[]{"Real need", "Stated need", "Secret need", "Hidden want"},
                0
        ));

        list.add(new Question(
                ". A customer expecting good after-sales service but not mentioning it shows .",
                new String[]{"Unstated need", "Stated need", "Real need", "Delight need"},
                0
        ));

        list.add(new Question(
                ". Getting free accessories or surprise gifts with a product represents a .",
                new String[]{"Secret need", "Delight need", "Real need", "Stated need"},
                1
        ));

        list.add(new Question(
                ". Buying a premium brand for status or recognition indicates a .",
                new String[]{"Secret need", "Real need", "Stated need", "Unstated need"},
                0
        ));

        list.add(new Question(
                ". Understanding customer needs is the of marketing.",
                new String[]{"End point", "Foundation", "Optional part", "Final step"},
                1
        ));

        list.add(new Question(
                ". Identifying needs and wants helps companies in .",
                new String[]{"Guessing demand", "Developing products that meet real expectations", "Increasing production only", "Avoiding product innovation"},
                1
        ));

        list.add(new Question(
                ". When marketers understand true customer needs, they can .",
                new String[]{"Reduce business risk", "Increase confusion", "Waste resources", "Ignore feedback"},
                0
        ));

        list.add(new Question(
                ". Different customer groups with different needs and wants help in .",
                new String[]{"Advertising only", "Market segmentation and targeting", "Cost control", "Product packaging"},
                1
        ));

        list.add(new Question(
                ". A company that meets customer needs better than competitors gains .",
                new String[]{"Customer dissatisfaction", "Competitive advantage", "Legal risk", "Market confusion"},
                1
        ));

        list.add(new Question(
                ". In the smartphone market, the need is for .",
                new String[]{"A particular brand", "Communication and connectivity", "Entertainment only", "Brand recognition"},
                1
        ));

        list.add(new Question(
                ". The want in the smartphone market example is .",
                new String[]{"Owning any phone", "A smartphone with camera and internet", "Having no phone", "Using a landline"},
                1
        ));

        list.add(new Question(
                ". The demand in the smartphone example occurs when .",
                new String[]{"The customer has no money", "The customer purchases an iPhone or Samsung", "The customer just browses online", "The customer asks for product details"},
                1
        ));

        list.add(new Question(
                ". The main difference between want and demand is .",
                new String[]{"Want has financial support; demand does not", "Demand has willingness and ability to pay; want may not", "Both are same", "Demand is emotional; want is practical"},
                1
        ));

        list.add(new Question(
                ". Marketers study needs, wants and demands primarily to .",
                new String[]{"Produce what is easiest", "Force customers to buy", "Design products that satisfy real human requirements", "Focus only on profit"},
                2
        ));

    }

    private static void addUnit5(ArrayList<Question> list) {
        list.add(new Question(
                ". Supply Chain Management (SCM) primarily involves ",
                new String[]{"Managing customer complaints and product returns.", "Coordinating and monitoring the flow of goods, services, and information from raw materials to final product delivery.", "Designing marketing strategies to boost product sales.", "Handling financial transactions and payroll management."},
                1
        ));

        list.add(new Question(
                ". Logistics management which leads to customer satisfaction and revenue growth.",
                new String[]{"increases costs and reduces customer satisfaction", "optimizes efficiency and enhances customer satisfaction, leading to revenue growth", "has no impact on revenue", "reduces inventory accuracy"},
                1
        ));

        list.add(new Question(
                ". Supply chain management contributes to business success..",
                new String[]{"By increasing product prices.", "By delivering products on time, enhancing customer satisfaction, and boosting revenue.", "By decreasing product availability.", "By minimizing customer interactions."},
                1
        ));

        list.add(new Question(
                "............ is the primary goal of supply chain management (SCM)",
                new String[]{"To maximize production costs", "To reduce customer satisfaction", "To deliver the right product at the right time, location and cost", "To decrease supplier relationships"},
                2
        ));

        list.add(new Question(
                "................ the main components involved in supply chain management.",
                new String[]{"Procurement, inventory management, distribution and delivery", "Marketing, branding, and customer loyalty.", "Finance, accounting and tax management.", "Advertising,human resource management."},
                0
        ));

        list.add(new Question(
                ". is the role of transportation in Supply Chain Management (SCM)",
                new String[]{"Production optimization", "Demand forecasting", "Movement of goods from one location to another", "Procurement negotiation"},
                2
        ));

        list.add(new Question(
                ".......... the importance of warehousing in Supply Chain Management (SCM) by selecting its primary purpose:",
                new String[]{"Reducing the need for inventory", "Storage and efficient management of inventory", "Eliminating transportation needs", "Only providing security for goods"},
                1
        ));

        list.add(new Question(
                ".......... is the primary objective of Supply Chain Management",
                new String[]{"Delivering the right product to the right place at the right time and cost", "Increasing warehousing costs", "Decreasing customer demand", "Reducing supplier involvement"},
                0
        ));

        list.add(new Question(
                ". Sourcing relates to ............... in supply Chain Management:",
                new String[]{"focuses on customer satisfaction; production focuses on storage", "deals with selecting suppliers that provide the best combination of cost, quality, and reliability.", "involve transportation", "handles order fulfillment"},
                1
        ));

        list.add(new Question(
                ". Choose the key component of logistics",
                new String[]{"Supplier auditing", "Market research", "Delivery of goods to customers", "Production scheduling"},
                2
        ));

        list.add(new Question(
                "................... relates to the ERP systems on supply chain operations:",
                new String[]{"Isolated data management", "Integrating functions such as procurement, inventory, and order processing", "Slower communication across departments", "Increased lead times"},
                1
        ));

        list.add(new Question(
                "............... is the role of predictive analytics in supply chain management:",
                new String[]{"Eliminating the need for data-driven decision-making", "Increasing transportation costs", "Forecasting demand and anticipating supply chain disruptions", "Limiting the use of technology in logistics"},
                2
        ));

        list.add(new Question(
                ".is a key advantage of IoT(Internet of Things) devices in logistics management:",
                new String[]{"Reducing supply chain visibility", "Tracking the movement and condition of goods in real-time", "Increasing manual monitoring", "Limiting partner communication"},
                1
        ));

        list.add(new Question(
                ". The primary focus of IT-enabled SCM is on",
                new String[]{"Real-time communication and visibility", "Manual data entry", "Product marketing", "Product branding"},
                0
        ));

        list.add(new Question(
                ". is one of the benefits of using IT in supply chain management.",
                new String[]{"Increased inefficiencies", "Enhanced collaboration and data-driven decision-making", "Higher operational costs", "Reduced transparency"},
                1
        ));

        list.add(new Question(
                ".. is the significance of HRM to an organization:",
                new String[]{"Limiting employee engagement", "Enhancing employee productivity and organizational culture", "Eliminating labor law compliance", "Only recruitment and dismissal"},
                1
        ));

        list.add(new Question(
                ". is the role of training and development by selecting its key benefit for employees:",
                new String[]{"Decreasing skills over time", "Increasing frustration", "Improving skills and knowledge for better performance", "Limiting exposure to new technologies"},
                2
        ));

        list.add(new Question(
                "is a key component of HRM related to employee assessment:",
                new String[]{"Performance management", "Recruitment & selection", "Compensation & benefits", "Work-life balance initiatives"},
                0
        ));

        list.add(new Question(
                ". Ethical considerations in HRM focus on",
                new String[]{"Offering competitive salaries", "Adherence to legal and ethical standards", "Limiting employee concerns", "Increasing work-life conflicts"},
                1
        ));

        list.add(new Question(
                ".. HRM principles improve employee morale:",
                new String[]{"Ignoring work-life balance", "Focusing only on compensation", "Promoting work-life balance initiatives", "Limiting development opportunities"},
                2
        ));

        list.add(new Question(
                "........... is the significance of HRM as a primary contributions to an organization:",
                new String[]{"Limiting engagement initiatives", "Enhancing productivity and organizational culture", "Avoiding labor compliance", "Only handling terminations"},
                1
        ));

        list.add(new Question(
                "................. the role of training and development by selecting its key benefit for employees:",
                new String[]{"Decreasing skill levels", "Increasing frustration", "Improving skills and knowledge", "Limiting exposure to technology"},
                2
        ));

        list.add(new Question(
                ". is a key component of HRM related to employee assessment:",
                new String[]{"Performance management", "Recruitment & selection", "Compensation & benefits", "Work-life balance"},
                0
        ));

        list.add(new Question(
                "............is a principle which can help to improve employee morale:",
                new String[]{"Ignoring work-life balance", "Focusing only on pay", "Promoting work-life balance initiatives", "Limiting development"},
                2
        ));

        list.add(new Question(
                "............... is the primary purpose of the \"Chalk Circle\" technique in the Toyota Production System-",
                new String[]{"To train employees in drawing techniques", "To encourage managers to physically participate in production", "To develop observation skills for identifying inefficiencies and areas for improvement", "To mark safety zones on the shop floor"},
                2
        ));

        list.add(new Question(
                ".................. leadership style that involves centralized decision-making:",
                new String[]{"Democratic Leadership", "Laissez-Faire Leadership", "Transformational Leadership", "Autocratic Leadership"},
                3
        ));

        list.add(new Question(
                ".................. leadership style is based on shared decision-making and participation:",
                new String[]{"Autocratic Leadership", "Laissez-Faire Leadership", "Democratic Leadership", "Transformational Leadership"},
                2
        ));

        list.add(new Question(
                "................ style do leaders inspire and motivate their employees to achieve higher goals and visions",
                new String[]{"Democratic Leadership", "Autocratic Leadership", "Laissez-Faire Leadership", "Transformational Leadership"},
                3
        ));

        list.add(new Question(
                "............... is the key feature of Laissez-Faire leadership:",
                new String[]{"The leader makes all decisions", "Employees have the freedom to make decisions", "The leader supervises all actions closely", "The leader focuses on inspiring employees"},
                1
        ));

        list.add(new Question(
                ".................... style fits an environment requiring strict control:",
                new String[]{"Autocratic Leadership", "Transformational Leadership", "Democratic Leadership", "Laissez-Faire Leadership"},
                0
        ));

        list.add(new Question(
                ". Supply Chain Management (SCM) mainly focuses on",
                new String[]{"Only manufacturing products", "Managing and co-ordinating the flow of goods and services from supplier to customer", "Advertising and promotion only", "Human resource management"},
                1
        ));

        list.add(new Question(
                ". Which of the following best describes a supply chain-",
                new String[]{"Only the transport system of goods", "A network connecting suppliers, manufacturers, warehouses and retailers", "A financial accounting system", "A marketing strategy"},
                1
        ));

        list.add(new Question(
                ". The main goal of SCM is to ensure",
                new String[]{"Expensive products and limited availability", "Right product, right customer, right time, right cost", "Only local distribution", "Focus only on production"},
                1
        ));

        list.add(new Question(
                ". In the supply chain of biscuits, the final stage is",
                new String[]{"Milling wheat into flour", "Packaging in factories", "Selling to the consumer", "Storage in warehouse"},
                2
        ));

        list.add(new Question(
                ". Which of the following is NOT part of a supply chain-",
                new String[]{"Supplier", "Manufacturer", "Warehouse", "Accountant"},
                3
        ));

        list.add(new Question(
                ". Supply Chain Management involves",
                new String[]{"Only production and manufacturing", "Planning, controlling and improving material and information flow", "Only transportation and packaging", "Advertising and promotion"},
                1
        ));

        list.add(new Question(
                ". Which of the following is an important benefit of SCM-",
                new String[]{"Increased cost and delays", "Reduced customer satisfaction", "Smooth flow of goods and reduced waste", "Ignoring supplier relationships"},
                2
        ));

        list.add(new Question(
                ". Better co-ordination in SCM means",
                new String[]{"Working in isolation", "Improved communication among suppliers, factories and dealers", "Reducing employee communication", "Focusing only on retailers"},
                1
        ));

        list.add(new Question(
                ". Logistics Management is a part of",
                new String[]{"Finance Management", "Supply Chain Management", "Marketing Management", "Human Resource Management"},
                1
        ));

        list.add(new Question(
                ". The main focus of logistics management is",
                new String[]{"Manufacturing new products", "Managing transportation, warehousing and distribution", "Creating advertisements", "Hiring employees"},
                1
        ));

        list.add(new Question(
                ". When an online order is packed, shipped and delivered, it is part of",
                new String[]{"Finance operations", "Marketing campaign", "Logistics management", "Accounting"},
                2
        ));

        list.add(new Question(
                ". Which of the following is NOT a major function of logistics management-",
                new String[]{"Transportation", "Warehousing", "Order processing", "Advertising design"},
                3
        ));

        list.add(new Question(
                ". Inventory control in logistics ensures",
                new String[]{"No stock is kept", "The right quantity of goods is available when needed", "Overproduction of goods", "Only storing goods for a long time"},
                1
        ));

        list.add(new Question(
                ". The main difference between SCM and Logistics is",
                new String[]{"Logistics is broader than SCM", "SCM focuses on overall co-ordination, while logistics focuses on transport and storage", "SCM and logistics are unrelated", "SCM only deals with advertising"},
                1
        ));

        list.add(new Question(
                ". In Samsungs example, logistics management is responsible for",
                new String[]{"Designing mobile phones", "Advertising and sales promotions", "Moving finished phones from factory to customer", "Recruiting engineers"},
                2
        ));

        list.add(new Question(
                ". Supply Chain Management (SCM) connects",
                new String[]{"Only customers and retailers", "Only manufacturers and warehouses", "Suppliers, manufacturers, warehouses, distributors and customers", "Only producers and government agencies"},
                2
        ));

        list.add(new Question(
                ". The main purpose of logistics management is to ensure",
                new String[]{"Smooth financial transactions only", "Fast, safe and cost-effective movement of goods", "Recruitment of supply staff", "Designing new products"},
                1
        ));

        list.add(new Question(
                ". A successful supply chain depends on",
                new String[]{"Advertising and sales promotion", "Smooth flow of materials, information and money", "Reducing suppliers", "Closing warehouses"},
                1
        ));

        list.add(new Question(
                ". The supply chain starts with",
                new String[]{"Retailers", "Distributors", "Suppliers", "Customers"},
                2
        ));

        list.add(new Question(
                ". Suppliers are important because they",
                new String[]{"Manufacture finished goods", "Provide raw materials and components", "Sell products to customers directly", "Handle customer service"},
                1
        ));

    }

}
