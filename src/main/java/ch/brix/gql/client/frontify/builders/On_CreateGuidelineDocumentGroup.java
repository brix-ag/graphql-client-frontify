package ch.brix.gql.client.frontify.builders;

public class On_CreateGuidelineDocumentGroup extends ch.brix.gql.client.TypeBuilder {
  public On_CreateGuidelineDocumentGroup() {
    super(new ch.brix.gql.client.On("CreateGuidelineDocumentGroup"));
  }
  /**
   * **BETA** The ID of the created document group.
   */
  public On_CreateGuidelineDocumentGroup id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The title of the created document group.
   */
  public On_CreateGuidelineDocumentGroup title() {
    _add_field("title");
    return this;
  }
}
