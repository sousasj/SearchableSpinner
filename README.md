# Read me
SearchableSpinnerEsta biblioteca surge da necessidade de poder fazer pesquisa no Spinner. 
E da discontinuidade que a outra biblioteca com o mesmo conceito teve

# Gradle

`
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}`
	
	
`dependencies {
		...
	        implementation 'com.github.sousasj:SearchableSpinner:1.0'
	}
	`

# Uso
`<net.sj.searchablespinnerlib.SearchableSpinner
        android:id="@+id/randomId"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginLeft="8dp"
        android:layout_marginTop="16dp"
        android:layout_marginEnd="8dp"
        android:layout_marginRight="8dp"
        app:hintText="Exemplo"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"/>`
