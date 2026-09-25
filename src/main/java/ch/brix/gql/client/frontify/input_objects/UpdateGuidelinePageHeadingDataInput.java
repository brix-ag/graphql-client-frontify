package ch.brix.gql.client.frontify.input_objects;

public class UpdateGuidelinePageHeadingDataInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `title` of the `GuidelinePageHeading` that should be set.
   */
  public UpdateGuidelinePageHeadingDataInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
}
