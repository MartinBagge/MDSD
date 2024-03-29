/**
 * generated by Xtext 2.10.0
 */
package master.mdsd.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import master.mdsd.game.Action;
import master.mdsd.game.Attack;
import master.mdsd.game.Attribute;
import master.mdsd.game.AttributeInitializer;
import master.mdsd.game.BooleanExpression;
import master.mdsd.game.Bullet;
import master.mdsd.game.CharDec;
import master.mdsd.game.CharacterAttr;
import master.mdsd.game.CompOperator;
import master.mdsd.game.Condition;
import master.mdsd.game.DynamicEntity;
import master.mdsd.game.Entity;
import master.mdsd.game.Expression;
import master.mdsd.game.GameMap;
import master.mdsd.game.Initializer;
import master.mdsd.game.IntLiteral;
import master.mdsd.game.Location;
import master.mdsd.game.LogicOperator;
import master.mdsd.game.Operation;
import master.mdsd.game.Pathfinding;
import master.mdsd.game.ReferenceCharacter;
import master.mdsd.game.StaticEntity;
import master.mdsd.game.TargetRef;
import master.mdsd.game.Type;
import master.mdsd.game.VECTOR;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class GameGenerator extends AbstractGenerator {
  private CharSequence all = "";
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.createAll(resource, fsa);
    fsa.generateFile("game.py", this.all);
  }
  
  public void createAll(final Resource resource, final IFileSystemAccess2 fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<DynamicEntity> _filter = Iterators.<DynamicEntity>filter(_allContents, DynamicEntity.class);
    final Procedure1<DynamicEntity> _function = (DynamicEntity it) -> {
      this.createEntityFile(it);
    };
    IteratorExtensions.<DynamicEntity>forEach(_filter, _function);
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterator<StaticEntity> _filter_1 = Iterators.<StaticEntity>filter(_allContents_1, StaticEntity.class);
    final Procedure1<StaticEntity> _function_1 = (StaticEntity it) -> {
      this.createEntityFile(it);
    };
    IteratorExtensions.<StaticEntity>forEach(_filter_1, _function_1);
    fsa.generateFile("game.py", this.all);
  }
  
  protected CharSequence _createEntityFile(final StaticEntity entity) {
    String _string = this.all.toString();
    CharSequence _createEntity = this.createEntity(entity);
    String _plus = (_string + _createEntity);
    return this.all = _plus;
  }
  
  protected CharSequence _createEntityFile(final DynamicEntity entity) {
    String _string = this.all.toString();
    CharSequence _createEntity = this.createEntity(entity);
    String _plus = (_string + _createEntity);
    return this.all = _plus;
  }
  
  protected CharSequence _createEntity(final StaticEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    String _entityId = entity.getEntityId();
    _builder.append(_entityId, "");
    _builder.append("():");
    _builder.newLineIfNotEmpty();
    {
      String _entityId_1 = entity.getEntityId();
      boolean _equals = _entityId_1.equals("Map");
      if (_equals) {
        _builder.append("\t");
        _builder.append("attributes = ");
        Map _createMap = this.createMap(((GameMap) entity));
        _builder.append(_createMap, "\t");
        _builder.newLineIfNotEmpty();
      } else {
        String _entityId_2 = entity.getEntityId();
        boolean _equals_1 = _entityId_2.equals("Initializer");
        if (_equals_1) {
          _builder.append("\t");
          _builder.append("attributes = ");
          Map _createInitializer = this.createInitializer(((Initializer) entity));
          _builder.append(_createInitializer, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public Map createMap(final GameMap gameMap) {
    Map attributes = CollectionLiterals.<Object, Object>newHashMap();
    EList<Attribute> _attributeList = gameMap.getAttributeList();
    for (final Attribute a : _attributeList) {
      Type _type = a.getType();
      VECTOR _valueIdVec = _type.getValueIdVec();
      boolean _notEquals = (!Objects.equal(_valueIdVec, null));
      if (_notEquals) {
        String _attributename = a.getAttributename();
        Type _type_1 = a.getType();
        VECTOR _valueIdVec_1 = _type_1.getValueIdVec();
        String _xVal = _valueIdVec_1.getXVal();
        Type _type_2 = a.getType();
        VECTOR _valueIdVec_2 = _type_2.getValueIdVec();
        String _yVal = _valueIdVec_2.getYVal();
        attributes.put(_attributename, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_xVal, _yVal)));
      } else {
        String _attributename_1 = a.getAttributename();
        Type _type_3 = a.getType();
        String _valueId = _type_3.getValueId();
        attributes.put(_attributename_1, _valueId);
      }
    }
    return attributes;
  }
  
  public Map createInitializer(final Initializer init) {
    Map attributes = CollectionLiterals.<Object, Object>newHashMap();
    int value = 0;
    EList<AttributeInitializer> _attributesInitializer = init.getAttributesInitializer();
    for (final AttributeInitializer a : _attributesInitializer) {
      String _attributeId = a.getAttributeId();
      boolean _equals = _attributeId.equals("spawn");
      if (_equals) {
        int _amountValueId = a.getAmountValueId();
        boolean _equals_1 = (_amountValueId == 0);
        if (_equals_1) {
          value = 1;
        } else {
          int _amountValueId_1 = a.getAmountValueId();
          value = _amountValueId_1;
        }
        List locations = CollectionLiterals.<Object>newArrayList();
        locations.add(Integer.valueOf(value));
        TargetRef _target = a.getTarget();
        EList<Location> _locationsId = _target.getLocationsId();
        for (final Location e : _locationsId) {
          String _locationId = e.getLocationId();
          boolean _notEquals = (!Objects.equal(_locationId, null));
          if (_notEquals) {
            String _locationId_1 = e.getLocationId();
            locations.add(_locationId_1);
          } else {
            Type _typea = e.getTypea();
            String _valueId = _typea.getValueId();
            Type _typeb = e.getTypeb();
            String _valueId_1 = _typeb.getValueId();
            locations.add(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_valueId, _valueId_1)));
          }
        }
        TargetRef _target_1 = a.getTarget();
        String _targetId = _target_1.getTargetId();
        attributes.put(_targetId, locations);
      }
    }
    return attributes;
  }
  
  protected CharSequence _createEntity(final DynamicEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    String _name = entity.getName();
    _builder.append(_name, "");
    _builder.append("():");
    _builder.newLineIfNotEmpty();
    {
      String _entityid = entity.getEntityid();
      boolean _equals = _entityid.equals("Character");
      if (_equals) {
        _builder.append("\t");
        _builder.append("attributes = ");
        Map _createCharacter = this.createCharacter(((master.mdsd.game.Character) entity));
        _builder.append(_createCharacter, "\t");
        _builder.newLineIfNotEmpty();
      } else {
        String _entityid_1 = entity.getEntityid();
        boolean _equals_1 = _entityid_1.equals("Object");
        if (_equals_1) {
          _builder.append("\t");
          _builder.append("attributes = ");
          Map _createObject = this.createObject(((master.mdsd.game.Object) entity));
          _builder.append(_createObject, "\t");
          _builder.newLineIfNotEmpty();
        } else {
          String _entityid_2 = entity.getEntityid();
          boolean _equals_2 = _entityid_2.equals("Pathfinding");
          if (_equals_2) {
            _builder.append("\t");
            _builder.append("attributes = ");
            Map _createPathfinding = this.createPathfinding(((Pathfinding) entity));
            _builder.append(_createPathfinding, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("def pathfinding():");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            CharSequence _createPathfindingFunc = this.createPathfindingFunc(((Pathfinding) entity));
            _builder.append(_createPathfindingFunc, "\t\t");
            _builder.newLineIfNotEmpty();
          } else {
            String _entityid_3 = entity.getEntityid();
            boolean _equals_3 = _entityid_3.equals("Attack");
            if (_equals_3) {
              _builder.append("\t");
              _builder.append("attributes = ");
              Map _createAttack = this.createAttack(((Attack) entity));
              _builder.append(_createAttack, "\t");
              _builder.newLineIfNotEmpty();
            } else {
              String _entityid_4 = entity.getEntityid();
              boolean _equals_4 = _entityid_4.equals("Bullet");
              if (_equals_4) {
                _builder.append("\t");
                _builder.append("attributes = ");
                Map _createBullet = this.createBullet(((Bullet) entity));
                _builder.append(_createBullet, "\t");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public Map createCharacter(final master.mdsd.game.Character character) {
    Map attributes = CollectionLiterals.<Object, Object>newHashMap();
    EList<Attribute> _att = character.getAtt();
    for (final Attribute a : _att) {
      Type _type = a.getType();
      VECTOR _valueIdVec = _type.getValueIdVec();
      boolean _notEquals = (!Objects.equal(_valueIdVec, null));
      if (_notEquals) {
        String _attributename = a.getAttributename();
        Type _type_1 = a.getType();
        VECTOR _valueIdVec_1 = _type_1.getValueIdVec();
        String _xVal = _valueIdVec_1.getXVal();
        Type _type_2 = a.getType();
        VECTOR _valueIdVec_2 = _type_2.getValueIdVec();
        String _yVal = _valueIdVec_2.getYVal();
        attributes.put(_attributename, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_xVal, _yVal)));
      } else {
        String _attributename_1 = a.getAttributename();
        Type _type_3 = a.getType();
        String _valueId = _type_3.getValueId();
        attributes.put(_attributename_1, _valueId);
      }
    }
    return attributes;
  }
  
  public Map createObject(final master.mdsd.game.Object object) {
    Map attributes = CollectionLiterals.<Object, Object>newHashMap();
    EList<Attribute> _att = object.getAtt();
    for (final Attribute a : _att) {
      Type _type = a.getType();
      VECTOR _valueIdVec = _type.getValueIdVec();
      boolean _notEquals = (!Objects.equal(_valueIdVec, null));
      if (_notEquals) {
        String _attributename = a.getAttributename();
        Type _type_1 = a.getType();
        VECTOR _valueIdVec_1 = _type_1.getValueIdVec();
        String _xVal = _valueIdVec_1.getXVal();
        Type _type_2 = a.getType();
        VECTOR _valueIdVec_2 = _type_2.getValueIdVec();
        String _yVal = _valueIdVec_2.getYVal();
        attributes.put(_attributename, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_xVal, _yVal)));
      } else {
        String _attributename_1 = a.getAttributename();
        Type _type_3 = a.getType();
        String _valueId = _type_3.getValueId();
        attributes.put(_attributename_1, _valueId);
      }
    }
    return attributes;
  }
  
  public Map createPathfinding(final Pathfinding pathfinding) {
    Map attributes = CollectionLiterals.<Object, Object>newHashMap();
    EList<Attribute> _attPathfinding = pathfinding.getAttPathfinding();
    for (final Attribute a : _attPathfinding) {
      Type _type = a.getType();
      VECTOR _valueIdVec = _type.getValueIdVec();
      boolean _notEquals = (!Objects.equal(_valueIdVec, null));
      if (_notEquals) {
        String _attributename = a.getAttributename();
        Type _type_1 = a.getType();
        VECTOR _valueIdVec_1 = _type_1.getValueIdVec();
        String _xVal = _valueIdVec_1.getXVal();
        Type _type_2 = a.getType();
        VECTOR _valueIdVec_2 = _type_2.getValueIdVec();
        String _yVal = _valueIdVec_2.getYVal();
        attributes.put(_attributename, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_xVal, _yVal)));
      } else {
        String _attributename_1 = a.getAttributename();
        Type _type_3 = a.getType();
        String _valueId = _type_3.getValueId();
        attributes.put(_attributename_1, _valueId);
      }
    }
    return attributes;
  }
  
  public Map createAttack(final Attack attack) {
    Map attributes = CollectionLiterals.<Object, Object>newHashMap();
    EList<Attribute> _attributes = attack.getAttributes();
    for (final Attribute a : _attributes) {
      Type _type = a.getType();
      VECTOR _valueIdVec = _type.getValueIdVec();
      boolean _notEquals = (!Objects.equal(_valueIdVec, null));
      if (_notEquals) {
        String _attributename = a.getAttributename();
        Type _type_1 = a.getType();
        VECTOR _valueIdVec_1 = _type_1.getValueIdVec();
        String _xVal = _valueIdVec_1.getXVal();
        Type _type_2 = a.getType();
        VECTOR _valueIdVec_2 = _type_2.getValueIdVec();
        String _yVal = _valueIdVec_2.getYVal();
        attributes.put(_attributename, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_xVal, _yVal)));
      } else {
        String _attributename_1 = a.getAttributename();
        Type _type_3 = a.getType();
        String _valueId = _type_3.getValueId();
        attributes.put(_attributename_1, _valueId);
      }
    }
    return attributes;
  }
  
  public Map createBullet(final Bullet bullet) {
    Map attributes = CollectionLiterals.<Object, Object>newHashMap();
    EList<Attribute> _attributesBullet = bullet.getAttributesBullet();
    for (final Attribute a : _attributesBullet) {
      Type _type = a.getType();
      VECTOR _valueIdVec = _type.getValueIdVec();
      boolean _notEquals = (!Objects.equal(_valueIdVec, null));
      if (_notEquals) {
        String _attributename = a.getAttributename();
        Type _type_1 = a.getType();
        VECTOR _valueIdVec_1 = _type_1.getValueIdVec();
        String _xVal = _valueIdVec_1.getXVal();
        Type _type_2 = a.getType();
        VECTOR _valueIdVec_2 = _type_2.getValueIdVec();
        String _yVal = _valueIdVec_2.getYVal();
        attributes.put(_attributename, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_xVal, _yVal)));
      } else {
        String _attributename_1 = a.getAttributename();
        Type _type_3 = a.getType();
        String _valueId = _type_3.getValueId();
        attributes.put(_attributename_1, _valueId);
      }
    }
    return attributes;
  }
  
  public CharSequence createPathfindingFunc(final Pathfinding pathfinding) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Condition> _conditions = pathfinding.getConditions();
      for(final Condition con : _conditions) {
        String _ifHelper = this.ifHelper(con, "if ");
        _builder.append(_ifHelper, "");
        _builder.append(":");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        Action _then = con.getThen();
        String _conAction = this.conAction(_then);
        _builder.append(_conAction, "\t");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        Condition _elseIfCondition = con.getElseIfCondition();
        CharSequence _elif = this.elif(_elseIfCondition);
        _builder.append(_elif, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence elif(final Condition elifCon) {
    StringConcatenation _builder = new StringConcatenation();
    String _ifHelper = this.ifHelper(elifCon, "elif ");
    _builder.append(_ifHelper, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    Action _then = elifCon.getThen();
    String _conAction = this.conAction(_then);
    _builder.append(_conAction, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      Condition _elseIfCondition = elifCon.getElseIfCondition();
      boolean _notEquals = (!Objects.equal(_elseIfCondition, null));
      if (_notEquals) {
        Condition _elseIfCondition_1 = elifCon.getElseIfCondition();
        CharSequence _elif = this.elif(_elseIfCondition_1);
        _builder.append(_elif, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public String ifHelper(final Condition con, final String ifCon) {
    BooleanExpression _ifCondition = con.getIfCondition();
    String _ifHelper2 = this.ifHelper2(_ifCondition);
    String ifs = (ifCon + _ifHelper2);
    int _length = ifs.length();
    int _minus = (_length - 1);
    String _substring = ifs.substring(0, _minus);
    ifs = _substring;
    return ifs;
  }
  
  public String conAction(final Action action) {
    String returnString = "";
    boolean isReference = false;
    CharacterAttr _charAtt = action.getCharAtt();
    ReferenceCharacter _reference = _charAtt.getReference();
    master.mdsd.game.Character _characterId = _reference.getCharacterId();
    boolean _notEquals = (!Objects.equal(_characterId, null));
    if (_notEquals) {
      CharacterAttr _charAtt_1 = action.getCharAtt();
      ReferenceCharacter _reference_1 = _charAtt_1.getReference();
      master.mdsd.game.Character _characterId_1 = _reference_1.getCharacterId();
      String _name = _characterId_1.getName();
      String _plus = (returnString + _name);
      String _plus_1 = (_plus + ".");
      returnString = _plus_1;
    } else {
      CharacterAttr _charAtt_2 = action.getCharAtt();
      ReferenceCharacter _reference_2 = _charAtt_2.getReference();
      String _targetId = _reference_2.getTargetId();
      boolean _notEquals_1 = (!Objects.equal(_targetId, null));
      if (_notEquals_1) {
        CharacterAttr _charAtt_3 = action.getCharAtt();
        ReferenceCharacter _reference_3 = _charAtt_3.getReference();
        String _targetId_1 = _reference_3.getTargetId();
        String _plus_2 = (returnString + _targetId_1);
        String _plus_3 = (_plus_2 + ".");
        returnString = _plus_3;
      }
    }
    CharacterAttr _charAtt_4 = action.getCharAtt();
    String _attributename = _charAtt_4.getAttributename();
    String _plus_4 = ((returnString + "attributes[") + _attributename);
    String _plus_5 = (_plus_4 + "] = ");
    returnString = _plus_5;
    CharDec _charDec = action.getCharDec();
    boolean _notEquals_2 = (!Objects.equal(_charDec, null));
    if (_notEquals_2) {
      CharDec _charDec_1 = action.getCharDec();
      String _val = _charDec_1.getVal();
      boolean _notEquals_3 = (!Objects.equal(_val, null));
      if (_notEquals_3) {
        CharDec _charDec_2 = action.getCharDec();
        String _val_1 = _charDec_2.getVal();
        String _plus_6 = (returnString + _val_1);
        returnString = _plus_6;
      } else {
        CharDec _charDec_3 = action.getCharDec();
        CharacterAttr _charAttResult = _charDec_3.getCharAttResult();
        ReferenceCharacter _reference_4 = _charAttResult.getReference();
        master.mdsd.game.Character _characterId_2 = _reference_4.getCharacterId();
        boolean _notEquals_4 = (!Objects.equal(_characterId_2, null));
        if (_notEquals_4) {
          CharDec _charDec_4 = action.getCharDec();
          CharacterAttr _charAttResult_1 = _charDec_4.getCharAttResult();
          ReferenceCharacter _reference_5 = _charAttResult_1.getReference();
          master.mdsd.game.Character _characterId_3 = _reference_5.getCharacterId();
          String _name_1 = _characterId_3.getName();
          String _plus_7 = (returnString + _name_1);
          String _plus_8 = (_plus_7 + ".");
          returnString = _plus_8;
          isReference = true;
        } else {
          CharDec _charDec_5 = action.getCharDec();
          CharacterAttr _charAttResult_2 = _charDec_5.getCharAttResult();
          ReferenceCharacter _reference_6 = _charAttResult_2.getReference();
          String _targetId_2 = _reference_6.getTargetId();
          boolean _notEquals_5 = (!Objects.equal(_targetId_2, null));
          if (_notEquals_5) {
            CharDec _charDec_6 = action.getCharDec();
            CharacterAttr _charAttResult_3 = _charDec_6.getCharAttResult();
            ReferenceCharacter _reference_7 = _charAttResult_3.getReference();
            String _targetId_3 = _reference_7.getTargetId();
            String _plus_9 = (returnString + _targetId_3);
            String _plus_10 = (_plus_9 + ".");
            returnString = _plus_10;
            isReference = true;
          }
        }
      }
      if (isReference) {
        CharDec _charDec_7 = action.getCharDec();
        CharacterAttr _charAttResult_4 = _charDec_7.getCharAttResult();
        String _attributename_1 = _charAttResult_4.getAttributename();
        String _plus_11 = ((returnString + "attributes[") + _attributename_1);
        String _plus_12 = (_plus_11 + "] ");
        returnString = _plus_12;
      }
      LogicOperator _op = action.getOp();
      boolean _notEquals_6 = (!Objects.equal(_op, null));
      if (_notEquals_6) {
        LogicOperator _op_1 = action.getOp();
        String _lop = _op_1.getLop();
        String _plus_13 = (returnString + _lop);
        String _plus_14 = (_plus_13 + " ");
        returnString = _plus_14;
      }
      Expression _ex = action.getEx();
      CharSequence _expression = this.expression(_ex);
      String _plus_15 = (returnString + _expression);
      returnString = _plus_15;
    }
    return returnString;
  }
  
  public String ifHelper2(final BooleanExpression boo) {
    String condition = "";
    CharacterAttr _attributeRefLeft = boo.getAttributeRefLeft();
    boolean _notEquals = (!Objects.equal(_attributeRefLeft, null));
    if (_notEquals) {
      CharacterAttr _attributeRefLeft_1 = boo.getAttributeRefLeft();
      ReferenceCharacter _reference = _attributeRefLeft_1.getReference();
      master.mdsd.game.Character _characterId = _reference.getCharacterId();
      boolean _notEquals_1 = (!Objects.equal(_characterId, null));
      if (_notEquals_1) {
        CharacterAttr _attributeRefLeft_2 = boo.getAttributeRefLeft();
        ReferenceCharacter _reference_1 = _attributeRefLeft_2.getReference();
        master.mdsd.game.Character _characterId_1 = _reference_1.getCharacterId();
        String _name = _characterId_1.getName();
        String _plus = (condition + _name);
        String _plus_1 = (_plus + ".");
        condition = _plus_1;
      }
      CharacterAttr _attributeRefLeft_3 = boo.getAttributeRefLeft();
      ReferenceCharacter _reference_2 = _attributeRefLeft_3.getReference();
      String _targetId = _reference_2.getTargetId();
      boolean _notEquals_2 = (!Objects.equal(_targetId, null));
      if (_notEquals_2) {
        CharacterAttr _attributeRefLeft_4 = boo.getAttributeRefLeft();
        ReferenceCharacter _reference_3 = _attributeRefLeft_4.getReference();
        String _targetId_1 = _reference_3.getTargetId();
        String _plus_2 = (condition + _targetId_1);
        String _plus_3 = (_plus_2 + ".");
        condition = _plus_3;
      }
      CharacterAttr _attributeRefLeft_5 = boo.getAttributeRefLeft();
      String _attributename = _attributeRefLeft_5.getAttributename();
      String _plus_4 = (condition + _attributename);
      String _plus_5 = (_plus_4 + " ");
      condition = _plus_5;
    }
    Expression _leftEx = boo.getLeftEx();
    boolean _notEquals_3 = (!Objects.equal(_leftEx, null));
    if (_notEquals_3) {
      Expression _leftEx_1 = boo.getLeftEx();
      CharSequence _expression = this.expression(_leftEx_1);
      String _plus_6 = (condition + _expression);
      String _plus_7 = (_plus_6 + " ");
      condition = _plus_7;
    }
    CompOperator _operator = boo.getOperator();
    String _op = _operator.getOp();
    String _plus_8 = (condition + _op);
    String _plus_9 = (_plus_8 + " ");
    condition = _plus_9;
    CharacterAttr _attributeRefRight = boo.getAttributeRefRight();
    boolean _notEquals_4 = (!Objects.equal(_attributeRefRight, null));
    if (_notEquals_4) {
      CharacterAttr _attributeRefRight_1 = boo.getAttributeRefRight();
      ReferenceCharacter _reference_4 = _attributeRefRight_1.getReference();
      master.mdsd.game.Character _characterId_2 = _reference_4.getCharacterId();
      boolean _notEquals_5 = (!Objects.equal(_characterId_2, null));
      if (_notEquals_5) {
        CharacterAttr _attributeRefRight_2 = boo.getAttributeRefRight();
        ReferenceCharacter _reference_5 = _attributeRefRight_2.getReference();
        master.mdsd.game.Character _characterId_3 = _reference_5.getCharacterId();
        String _name_1 = _characterId_3.getName();
        String _plus_10 = (condition + _name_1);
        String _plus_11 = (_plus_10 + ".");
        condition = _plus_11;
      }
      CharacterAttr _attributeRefRight_3 = boo.getAttributeRefRight();
      ReferenceCharacter _reference_6 = _attributeRefRight_3.getReference();
      String _targetId_2 = _reference_6.getTargetId();
      boolean _notEquals_6 = (!Objects.equal(_targetId_2, null));
      if (_notEquals_6) {
        CharacterAttr _attributeRefRight_4 = boo.getAttributeRefRight();
        ReferenceCharacter _reference_7 = _attributeRefRight_4.getReference();
        String _targetId_3 = _reference_7.getTargetId();
        String _plus_12 = (condition + _targetId_3);
        String _plus_13 = (_plus_12 + ".");
        condition = _plus_13;
      }
      CharacterAttr _attributeRefRight_5 = boo.getAttributeRefRight();
      String _attributename_1 = _attributeRefRight_5.getAttributename();
      String _plus_14 = (condition + _attributename_1);
      String _plus_15 = (_plus_14 + " ");
      condition = _plus_15;
    }
    Expression _rightEx = boo.getRightEx();
    boolean _notEquals_7 = (!Objects.equal(_rightEx, null));
    if (_notEquals_7) {
      LogicOperator _op_1 = boo.getOp();
      boolean _notEquals_8 = (!Objects.equal(_op_1, null));
      if (_notEquals_8) {
        LogicOperator _op_2 = boo.getOp();
        String _lop = _op_2.getLop();
        String _plus_16 = (condition + _lop);
        String _plus_17 = (_plus_16 + " ");
        condition = _plus_17;
      }
      Expression _rightEx_1 = boo.getRightEx();
      CharSequence _expression_1 = this.expression(_rightEx_1);
      String _plus_18 = (condition + _expression_1);
      condition = _plus_18;
    }
    return condition;
  }
  
  protected CharSequence _expression(final Expression i) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _tm = i.getTm();
    CharSequence _expression = this.expression(_tm);
    _builder.append(_expression, "");
    return _builder;
  }
  
  protected CharSequence _expression(final IntLiteral i) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = i.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  protected CharSequence _expression(final Operation i) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = i.getLeft();
    CharSequence _expression = this.expression(_left);
    _builder.append(_expression, "");
    _builder.append(" ");
    LogicOperator _op = i.getOp();
    String _lop = _op.getLop();
    _builder.append(_lop, "");
    _builder.append(" ");
    Expression _right = i.getRight();
    CharSequence _expression_1 = this.expression(_right);
    _builder.append(_expression_1, "");
    return _builder;
  }
  
  public CharSequence createEntityFile(final Entity entity) {
    if (entity instanceof DynamicEntity) {
      return _createEntityFile((DynamicEntity)entity);
    } else if (entity instanceof StaticEntity) {
      return _createEntityFile((StaticEntity)entity);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(entity).toString());
    }
  }
  
  public CharSequence createEntity(final Entity entity) {
    if (entity instanceof DynamicEntity) {
      return _createEntity((DynamicEntity)entity);
    } else if (entity instanceof StaticEntity) {
      return _createEntity((StaticEntity)entity);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(entity).toString());
    }
  }
  
  public CharSequence expression(final Expression i) {
    if (i instanceof IntLiteral) {
      return _expression((IntLiteral)i);
    } else if (i instanceof Operation) {
      return _expression((Operation)i);
    } else if (i != null) {
      return _expression(i);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(i).toString());
    }
  }
}
