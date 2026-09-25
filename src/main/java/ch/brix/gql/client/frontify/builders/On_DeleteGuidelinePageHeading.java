package ch.brix.gql.client.frontify.builders;

public class On_DeleteGuidelinePageHeading extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteGuidelinePageHeading() {
    super(new ch.brix.gql.client.On("DeleteGuidelinePageHeading"));
  }
  /**
   * **BETA** The id of the deleted `GuidelinePageHeading`.
   */
  public On_DeleteGuidelinePageHeading id() {
    _add_field("id");
    return this;
  }
}
