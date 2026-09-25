package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataCatalogEntry extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataCatalogEntry() {
    super(new ch.brix.gql.client.On("CustomMetadataCatalogEntry"));
  }
  /**
   * **BETA** Cells readable for displaying this selected catalog entry.
   */
  public On_CustomMetadataCatalogEntry cells(CustomMetadataCatalogEntry_cells callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Opaque catalog selection entry ID.
   */
  public On_CustomMetadataCatalogEntry id() {
    _add_field("id");
    return this;
  }
}
