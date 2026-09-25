package ch.brix.gql.client.frontify.builders;

public class On_DeleteGuidelinePageSectionReferenced extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteGuidelinePageSectionReferenced() {
    super(new ch.brix.gql.client.On("DeleteGuidelinePageSectionReferenced"));
  }
  /**
   * **BETA** The references of the `Section` that should have been deleted.
   */
  public On_DeleteGuidelinePageSectionReferenced references(DeleteGuidelinePageSectionReferenced_references callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
