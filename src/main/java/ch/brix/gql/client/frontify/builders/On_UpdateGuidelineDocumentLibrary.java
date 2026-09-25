package ch.brix.gql.client.frontify.builders;

public class On_UpdateGuidelineDocumentLibrary extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateGuidelineDocumentLibrary() {
    super(new ch.brix.gql.client.On("UpdateGuidelineDocumentLibrary"));
  }
  /**
   * **BETA** The ID of the updated document library.
   */
  public On_UpdateGuidelineDocumentLibrary id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The title of the document library after the update.
   */
  public On_UpdateGuidelineDocumentLibrary title() {
    _add_field("title");
    return this;
  }
}
