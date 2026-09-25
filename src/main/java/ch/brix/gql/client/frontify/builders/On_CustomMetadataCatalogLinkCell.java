package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataCatalogLinkCell extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataCatalogLinkCell() {
    super(new ch.brix.gql.client.On("CustomMetadataCatalogLinkCell"));
  }
  /**
   * **BETA** Catalog column of this link cell readable through custom metadata visibility.
   */
  public On_CustomMetadataCatalogLinkCell column(CustomMetadataCatalogLinkCell_column callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Linked row details readable through custom metadata visibility.
   */
  public On_CustomMetadataCatalogLinkCell links(CustomMetadataCatalogLinkCell_links callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Link display values readable through custom metadata visibility.
   */
  public On_CustomMetadataCatalogLinkCell values() {
    _add_field("values");
    return this;
  }
}
