class GesArticle {
    private String ref;
    private String categorie;
    private String denomination;
    private String descriptif;
    private float prix;
    private int stock;
    private float poids;

    public GesArticle(String ref, String categorie,String denomination, String descriptif, float prix, int stock, float poids) {
        this.ref = ref;
        this.categorie = categorie;
        this.denomination = denomination;
        this.descriptif = descriptif;
        this.prix = prix;
        this.stock = stock;
        this.poids = poids;
    }

    public String ToString() {
        String Str = this.ref + " " + this.denomination + " " + this.prix;
        return Str;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }
}
