package ch.brix.gql.client.frontify.builders;

public class On_CreateGuidelineDocumentLibrary extends ch.brix.gql.client.TypeBuilder {
  public On_CreateGuidelineDocumentLibrary() {
    super(new ch.brix.gql.client.On("CreateGuidelineDocumentLibrary"));
  }
  /**
   * **BETA** The ID of the created document library.
   */
  public On_CreateGuidelineDocumentLibrary id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The title of the created document
   */
  public On_CreateGuidelineDocumentLibrary title() {
    _add_field("title");
    return this;
  }
  /**
   * **BETA** The heading of the created document
   */
  public On_CreateGuidelineDocumentLibrary heading() {
    _add_field("heading");
    return this;
  }
  /**
   * **BETA** The subheading of the created document
   */
  public On_CreateGuidelineDocumentLibrary subheading() {
    _add_field("subheading");
    return this;
  }
}
