package ch.brix.gql.client.frontify.builders;

public class CatalogSelectionEntry_children extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.CatalogSelectionEntry>> {
  public CatalogSelectionEntry_children() {
    super(new ch.brix.gql.client.Call<>("children", "CatalogSelectionEntry"));
  }
  public CatalogSelectionEntry_children onCatalogSelectionEntry(On_CatalogSelectionEntry typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
