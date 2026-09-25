package ch.brix.gql.client.frontify.builders;

public class On_UpdateGuidelineDocumentGroup extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateGuidelineDocumentGroup() {
    super(new ch.brix.gql.client.On("UpdateGuidelineDocumentGroup"));
  }
  /**
   * **BETA** The ID of the updated document group.
   */
  public On_UpdateGuidelineDocumentGroup id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The title of the document group after the update.
   */
  public On_UpdateGuidelineDocumentGroup title() {
    _add_field("title");
    return this;
  }
}
