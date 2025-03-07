package ch.brix.gql.client.frontify.input_objects;

public class MarkingTimeframeInput extends ch.brix.gql.client.InputObject {
  /**
   * The start of the `Marking` area in percentage of total video length. Defaults to video start (0) when the timeframe input property is set.
   */
  public MarkingTimeframeInput start(ch.brix.gql.client.frontify.scalars.PercentScalar v) {
    values.put("start", v);
    return this;
  }
  /**
   * The end of the `Marking` area in percentage of total video length. Defaults to video end (1) when the timeframe input property is set.
   */
  public MarkingTimeframeInput end(ch.brix.gql.client.frontify.scalars.PercentScalar v) {
    values.put("end", v);
    return this;
  }
}
