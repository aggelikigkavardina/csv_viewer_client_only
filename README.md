# Dataset Manager Application

## Description

This project was developed as part of the **Software Engineering** course (University of Ioannina, 2018–2019).  
The application is built in Java (Eclipse project structure) and focuses on managing CSV datasets via a simple GUI frontend and a custom backend.

Users can:
- Load and save datasets from CSV files
- Filter datasets based on field values
- Track the origin/history of datasets (source file or filtering)
- Plot graphs (line or scatter) using dataset fields
- Exit the application cleanly

---

## Team

- Angeliki Gkavardina – ID: 4042  
- Dimitra Despoina Antoniou – ID: 4026  
- Ioanna Kokkali – ID: 4268  

---

## Features (Use Cases)

| ID    | Name         | Description                                                                  |
|-------|--------------|------------------------------------------------------------------------------|
| UC1   | QuitApp      | Closes the application and all its windows                                   |
| UC2   | SaveFile     | Loads a CSV file, stores it as a named dataset in memory                     |
| UC3   | LoadFile     | Loads an existing dataset into the UI                                        |
| UC4   | FilterDataset| Filters a dataset and saves the result as a new one                          |
| UC5   | PrintHistory | Displays the origin of a dataset (source file or parent dataset + filter)    |
| UC6   | PlotGraph    | Plots selected fields (X, Y) from a dataset using JavaFX charts              |

---

## Technologies Used

- **Language**: Java
- **IDE**: Eclipse
- **UI**: JavaFX (FXML & Controllers)
- **Backend**: Custom interfaces and classes (DatasetManager, Dataset, etc.)
- **CSV Reader**: Utils package
- **Testing**: JUnit

---

## Package Structure

| Package             | Role                                            |
|---------------------|--------------------------------------------------|
| `client`            | Manages app startup                             |
| `client.controllers`| Frontend controllers (JavaFX)                   |
| `server`            | Backend logic (DatasetManager, Dataset, etc.)   |
| `utils`             | CSV file parsing utilities                      |
| `test`              | Unit tests for core functionalities             |

---

## How to Run

1. **Open the project** in Eclipse IDE
2. **Ensure JavaFX is properly set up**
3. **Run `MainApp.java`** in the `client` package

---

## Testing

Includes unit tests for:
- Dataset registration and retrieval
- Filtering logic
- Dataset history tracking
- Projection for plotting

---

## Resources

Test `.csv` files are provided under the `Resources/` directory for local execution and development.

---

## License

This project is an academic exercise and not licensed for production use.
