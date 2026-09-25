package ch.brix.gql.client.frontify.builders;

public class On_GuidelinePageBlockLocation extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelinePageBlockLocation() {
    super(new ch.brix.gql.client.On("GuidelinePageBlockLocation"));
  }
  /**
   * **BETA** The absolute url of the `GuidelinePageBlockLocation`.
   */
  public On_GuidelinePageBlockLocation url() {
    _add_field("url");
    return this;
  }
  /**
   * **BETA** `GuidelinePageBlockLocation` location path.
   */
  public On_GuidelinePageBlockLocation path() {
    _add_field("path");
    return this;
  }
}
