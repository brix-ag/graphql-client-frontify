package ch.brix.gql.client.frontify.builders;

public class SetCatalogColumnAsPrimary_column extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.CatalogColumn> {
  public SetCatalogColumnAsPrimary_column() {
    super(new ch.brix.gql.client.Call<>("column", "CatalogColumn"));
  }
  public SetCatalogColumnAsPrimary_column onCatalogLinkColumn(On_CatalogLinkColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public SetCatalogColumnAsPrimary_column onCatalogTextColumn(On_CatalogTextColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public SetCatalogColumnAsPrimary_column onCatalogColumn(On_CatalogColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
