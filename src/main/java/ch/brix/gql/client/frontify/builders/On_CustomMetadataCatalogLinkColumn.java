package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataCatalogLinkColumn extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataCatalogLinkColumn() {
    super(new ch.brix.gql.client.On("CustomMetadataCatalogLinkColumn"));
  }
  /**
   * **BETA** Opaque catalog link column ID readable through custom metadata visibility.
   */
  public On_CustomMetadataCatalogLinkColumn id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** Catalog link column name readable through custom metadata visibility.
   */
  public On_CustomMetadataCatalogLinkColumn name() {
    _add_field("name");
    return this;
  }
}
