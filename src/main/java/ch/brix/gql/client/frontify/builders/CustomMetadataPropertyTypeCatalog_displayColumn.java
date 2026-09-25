package ch.brix.gql.client.frontify.builders;

public class CustomMetadataPropertyTypeCatalog_displayColumn extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.CatalogColumn> {
  public CustomMetadataPropertyTypeCatalog_displayColumn() {
    super(new ch.brix.gql.client.Call<>("displayColumn", "CatalogColumn"));
  }
  public CustomMetadataPropertyTypeCatalog_displayColumn onCatalogLinkColumn(On_CatalogLinkColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataPropertyTypeCatalog_displayColumn onCatalogTextColumn(On_CatalogTextColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataPropertyTypeCatalog_displayColumn onCatalogColumn(On_CatalogColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
