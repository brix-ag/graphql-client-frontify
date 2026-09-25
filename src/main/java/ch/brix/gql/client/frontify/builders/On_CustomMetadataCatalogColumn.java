package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataCatalogColumn extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataCatalogColumn() {
    super(new ch.brix.gql.client.On("CustomMetadataCatalogColumn"));
  }
  /**
   * **BETA** Opaque catalog column ID readable through custom metadata visibility.
   */
  public On_CustomMetadataCatalogColumn id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** Catalog column name readable through custom metadata visibility.
   */
  public On_CustomMetadataCatalogColumn name() {
    _add_field("name");
    return this;
  }
}
