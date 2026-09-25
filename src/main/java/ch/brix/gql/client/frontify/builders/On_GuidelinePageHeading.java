package ch.brix.gql.client.frontify.builders;

public class On_GuidelinePageHeading extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelinePageHeading() {
    super(new ch.brix.gql.client.On("GuidelinePageHeading"));
  }
  /**
   * **BETA** `GuidelinePageHeading` id.
   */
  public On_GuidelinePageHeading id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** `GuidelinePageHeading` title.
   */
  public On_GuidelinePageHeading title() {
    _add_field("title");
    return this;
  }
  /**
   * **BETA** `GuidelinePageHeading` url.
   */
  public On_GuidelinePageHeading url() {
    _add_field("url");
    return this;
  }
  /**
   * **BETA** The timestamp of the most recent modification to the `GuidelinePageHeading`. If not modified, this represents the creation time.
   */
  public On_GuidelinePageHeading modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
}
