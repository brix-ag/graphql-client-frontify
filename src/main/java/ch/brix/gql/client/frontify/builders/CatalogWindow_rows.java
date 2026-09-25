package ch.brix.gql.client.frontify.builders;

public class CatalogWindow_rows extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CatalogWindowRowItems> {
  public CatalogWindow_rows() {
    super(new ch.brix.gql.client.Call<>("rows", "CatalogWindowRowItems"));
  }
  public CatalogWindow_rows onCatalogWindowRowItems(On_CatalogWindowRowItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
