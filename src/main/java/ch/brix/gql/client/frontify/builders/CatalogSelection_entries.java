package ch.brix.gql.client.frontify.builders;

public class CatalogSelection_entries extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.CatalogSelectionEntry>> {
  public CatalogSelection_entries() {
    super(new ch.brix.gql.client.Call<>("entries", "CatalogSelectionEntry"));
  }
  public CatalogSelection_entries onCatalogSelectionEntry(On_CatalogSelectionEntry typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
