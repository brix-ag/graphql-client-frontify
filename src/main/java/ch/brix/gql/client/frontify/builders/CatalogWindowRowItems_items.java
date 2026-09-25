package ch.brix.gql.client.frontify.builders;

public class CatalogWindowRowItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.CatalogWindowRow>> {
  public CatalogWindowRowItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "CatalogWindowRow"));
  }
  public CatalogWindowRowItems_items onCatalogWindowRow(On_CatalogWindowRow typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
