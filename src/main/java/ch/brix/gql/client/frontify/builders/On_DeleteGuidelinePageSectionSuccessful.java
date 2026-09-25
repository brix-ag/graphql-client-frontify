package ch.brix.gql.client.frontify.builders;

public class On_DeleteGuidelinePageSectionSuccessful extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteGuidelinePageSectionSuccessful() {
    super(new ch.brix.gql.client.On("DeleteGuidelinePageSectionSuccessful"));
  }
  /**
   * **BETA** The id of the `Section` that was deleted.
   */
  public On_DeleteGuidelinePageSectionSuccessful id() {
    _add_field("id");
    return this;
  }
}
