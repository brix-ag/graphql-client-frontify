package ch.brix.gql.client.frontify.builders;

public class CatalogColumnItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.CatalogColumn>> {
  public CatalogColumnItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "CatalogColumn"));
  }
  public CatalogColumnItems_items onCatalogLinkColumn(On_CatalogLinkColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CatalogColumnItems_items onCatalogTextColumn(On_CatalogTextColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CatalogColumnItems_items onCatalogColumn(On_CatalogColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
