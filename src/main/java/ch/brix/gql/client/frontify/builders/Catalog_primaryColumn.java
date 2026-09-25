package ch.brix.gql.client.frontify.builders;

public class Catalog_primaryColumn extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.CatalogColumn> {
  public Catalog_primaryColumn() {
    super(new ch.brix.gql.client.Call<>("primaryColumn", "CatalogColumn"));
  }
  public Catalog_primaryColumn onCatalogLinkColumn(On_CatalogLinkColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public Catalog_primaryColumn onCatalogTextColumn(On_CatalogTextColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public Catalog_primaryColumn onCatalogColumn(On_CatalogColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
