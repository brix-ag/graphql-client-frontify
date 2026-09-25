package ch.brix.gql.client.frontify.builders;

public class On_DeleteGuidelineDocumentLibrary extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteGuidelineDocumentLibrary() {
    super(new ch.brix.gql.client.On("DeleteGuidelineDocumentLibrary"));
  }
  /**
   * **BETA** The ID of the deleted document library.
   */
  public On_DeleteGuidelineDocumentLibrary id() {
    _add_field("id");
    return this;
  }
}
