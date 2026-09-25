package ch.brix.gql.client.frontify.builders;

public class On_DeleteGuidelineDocumentGroup extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteGuidelineDocumentGroup() {
    super(new ch.brix.gql.client.On("DeleteGuidelineDocumentGroup"));
  }
  /**
   * **BETA** The ID of the deleted document group.
   */
  public On_DeleteGuidelineDocumentGroup id() {
    _add_field("id");
    return this;
  }
}
