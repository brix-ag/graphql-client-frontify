package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataCatalogTextColumn extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataCatalogTextColumn() {
    super(new ch.brix.gql.client.On("CustomMetadataCatalogTextColumn"));
  }
  /**
   * **BETA** Opaque catalog text column ID readable through custom metadata visibility.
   */
  public On_CustomMetadataCatalogTextColumn id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** Catalog text column name readable through custom metadata visibility.
   */
  public On_CustomMetadataCatalogTextColumn name() {
    _add_field("name");
    return this;
  }
}
