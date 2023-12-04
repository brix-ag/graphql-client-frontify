package ch.brix.gql.client.frontify.input_objects;

public class TagInput extends ch.brix.gql.client.InputObject {
  /**
   * Tag name.
   */
  public TagInput value(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("value", v);
    return this;
  }
}
