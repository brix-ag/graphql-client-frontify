package ch.brix.gql.client.frontify.builders;

public class On_UpdateGuidelineDocumentPage extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateGuidelineDocumentPage() {
    super(new ch.brix.gql.client.On("UpdateGuidelineDocumentPage"));
  }
  /**
   * **BETA** The ID of the updated document page.
   */
  public On_UpdateGuidelineDocumentPage id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The title of the document page after the update.
   */
  public On_UpdateGuidelineDocumentPage title() {
    _add_field("title");
    return this;
  }
  /**
   * **BETA** The heading of the document page after the update.
   */
  public On_UpdateGuidelineDocumentPage heading() {
    _add_field("heading");
    return this;
  }
  /**
   * **BETA** The subheading of the document page after the update.
   */
  public On_UpdateGuidelineDocumentPage subheading() {
    _add_field("subheading");
    return this;
  }
}
